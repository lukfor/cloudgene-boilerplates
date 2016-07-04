# Cloudgene Boilerplate for MapReduce workflows

A boilerplate for a cloudgene application that contains a MapReduce workflow.

This is a minimal and ready-to-run application which can be used to start your own projects.

```
git clone https://github.com/lukfor/cloudgene-boilerplates
```

Next, you have to import the project into Eclipse or you can execute maven to build the jar file:

```
cd cloudgene-boilerplates/mapreduce
mvn package
```


Finally, use Docker to test your application:

```
sudo docker run --privileged -it -p 8082:8082 -v $(pwd)/target/:/opt/cloudgene/apps/ seppinho/cloudgene-docker

```
