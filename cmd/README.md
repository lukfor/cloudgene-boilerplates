# Cloudgene Boilerplate for Command-line workflows

A boilerplate for a cloudgene application that contains a workflow with several command-line programs.

This is a minimal and ready-to-run application which can be used to start your own projects.

```
git clone https://github.com/lukfor/cloudgene-boilerplates
```

Next, navigate to cmd folder:
```
cd cmd
```


Finally, use Docker to test your application:

```
sudo docker run --privileged -it -p 8082:8082 -v $(pwd)/src/:/opt/cloudgene/apps/ seppinho/cloudgene-docker
```

Open http://127.0.0.1:8082 to see your application in action.

