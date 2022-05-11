set JAVA_HOME=C:\Program Files\Java\jdk-11.0.13
set M2_HOME=C:\Program Files\apache-maven-3.8.4
 
set PATH=%PATH%;%JAVA_HOME%\bin;%M2_HOME%\bin

@REM call mvnw quarkus:add-extension -Dextensions="openshift"
call mvnw quarkus:dev
cmd / k