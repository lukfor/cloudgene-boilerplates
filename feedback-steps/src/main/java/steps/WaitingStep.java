package steps;

import genepi.hadoop.common.WorkflowContext;
import genepi.hadoop.common.WorkflowStep;

public class WaitingStep extends WorkflowStep {

	@Override
	public boolean run(WorkflowContext context) {

		try {

			//start new task
			context.beginTask("Please wait...");

			// read params from user interface
			int seconds = Integer.parseInt(context.get("seconds"));

			// update task
			context.updateTask("Please wait <b>" + seconds + "</b> seconds...", WorkflowContext.RUNNING);

			Thread.sleep(15 * 1000);
			context.endTask("Done!", WorkflowContext.OK);

			return true;
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
			context.endTask("Error: " + e.toString(), WorkflowContext.ERROR);
			return false;
		
		} catch (Exception e) {
			e.printStackTrace();
			context.endTask("Error: " + e.toString(), WorkflowContext.ERROR);
			return false;
		}

	}

}
