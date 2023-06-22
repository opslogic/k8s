# Build Image
Change the JDK location and dockerhub details per your environment.
```shell
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-11.0.12.jdk/Contents/Home
./gradlew clean build
docker build -t sandeepmaurya/greetings .
```
This will build an image and tag it to be uploaded to dockerhub {account}/{repository}.

# Push Image
```shell
docker push sandeepmaurya/greetings
```

