set JAVA_HOME=C:\Program Files\Java\jdk-11.0.13
set M2_HOME=C:\Program Files\apache-maven-3.6.0-bin\apache-maven-3.6.0
 
set PATH=%PATH%;%JAVA_HOME%\bin;%M2_HOME%\bin
call mvnw clean package -Dquarkus.kubernetes.deploy=true
cmd / k