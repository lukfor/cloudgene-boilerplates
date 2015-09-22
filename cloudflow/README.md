# Cloudgene Boilerplate for Cloudflow pipelines

This is a minimal and ready-to-run application which can be used to start your own Cloudflow pipelines.

## Create application

A new Cloudgene application based on this boilerplate can be created by typing the following command:

```
cgapps init --app username/myapp --boilerplate cloudflow
```

This command creates a folder myapp which contains all needed files.


### Build application

Navigate in your project folder and use maven do build your cloudflow pipeline:

```
mvn package
```

### Test application

Navigate in your project folder and use test command to test your application using Docker:

```
cgapps test
```

### Share application

Navigate in your project folder and use push command to upload and share your application:

```
cgapps pull
```
