package genepi.cloudflow.examples;

import java.io.IOException;

import cloudflow.core.Pipeline;
import cloudflow.core.hadoop.MapReduceRunner;
import cloudflow.core.operations.Transformer;
import cloudflow.core.records.IntegerRecord;
import cloudflow.core.records.TextRecord;

public class WordCount {

	public static class LineToWords extends
			Transformer<TextRecord, IntegerRecord> {

		private IntegerRecord out = new IntegerRecord();

		public LineToWords() {
			super(TextRecord.class, IntegerRecord.class);
		}

		public void transform(TextRecord rec) {
			String[] words = rec.getValue().split(" ");
			for (String word : words) {
				out.setKey(word);
				out.setValue(1);
				emit(out);
			}
		}
	}

	public static void main(String[] args) throws IOException {

		String input = args[0];
		String output = args[1];

		Pipeline pipeline = new Pipeline("WordCount", WordCount.class);
		pipeline.loadText(input).apply(LineToWords.class).sum().save(output);

		new MapReduceRunner().run(pipeline);

	}
}