set JAVA_HOME=C:\Program Files\Java\jdk-11.0.13
set M2_HOME=C:\Program Files\apache-maven-3.8.4
 
set PATH=%PATH%;%JAVA_HOME%\bin;%M2_HOME%\bin

call mvnw quarkus:add-extension -Dextensions="openshift"
cmd / k


@REM  You need to add the quarkus-openshift extension as a dependency to your Quarkus project so that you can build and deploy your applications as a container image to be used inside your OpenShift cluster.

@REM The OpenShift extension also generates OpenShift resources such as image streams, build configuration, deployment configuration, service definitions, and more. If your Quarkus application includes the quarkus-smallrye-health extension OpenShift can access the health endpoint and check the liveness and readiness of your application.