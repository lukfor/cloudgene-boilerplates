# Cloudgene Boilerplate for MapReduce workflows

A boilerplate for a cloudgene application that contains a MapReduce workflow.

This is a minimal and ready-to-run application which can be used to start your own projects.

A new cloudgene appliation based on this boilerplate can be created by typing the following command:

```
cgapps init --app myapp --boilerplate mapreduce
```

This command creates a folder myapp which contains all needed files.

Navigate in that folder and use maven do package your java mapreduce program:

```
mvn package
```

Finally, use the test command to test your application using Docker:

```
cgapps test
```
