# code-with-quarkus Project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/code-with-quarkus-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Related Guides

- RESTEasy Reactive ([guide](https://quarkus.io/guides/resteasy-reactive)): A JAX-RS implementation utilizing build time processing and Vert.x. This extension is not compatible with the quarkus-resteasy extension, or any of the extensions that depend on it.

## Provided Code

### RESTEasy Reactive

Easily start your Reactive RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)



### Openshift

minishift start --vm-driver virtualbox 
minishift oc-env
@FOR /f "tokens=*" %i IN ('minishift oc-env') DO @call %i
oc login -u developer -p developer
oc new-project dev

--Assegno i permessi admin all'utente default per il progetto dev, in questo modo creo un RoleBinding con ServiceAccount default e permessi admin
oc policy add-role-to-user admin system:serviceaccount:dev:default

oc import-image --confirm openjdk/openjdk-11-rhel7 --from=registry.access.redhat.com/openjdk/openjdk-11-rhel7
oc new-app openjdk-11-rhel7 https://github.com/antonio0426/TestUsers --name=test-users-s2i-app (nome immagine test-users-s2i-app)

oc import-image --confirm openjdk-11:latest --from=registry.access.redhat.com/ubi8/openjdk-11
oc new-app openjdk-11 https://github.com/antonio0426/TestUsers --name=test-users-s2i-app 


oc new-app openjdk-11-rhel7 https://github.com/antonio0426/TestUsersDB --name=test-users-db-s2i-app
oc new-app openjdk-11 https://github.com/antonio0426/TestUsersDB --name=test-users-db-s2i-app 

login: docker
pass: tcuser

#Per aggiornare il progetto
oc start-build test-users-s2i-app 

#Descrizione
L'immagine openjdk/openjdk-11-rhel7 viene utilizzata per la build, The container image contains S2I integration scripts 
for deployment on Red Hat OpenShift.
Quindi è limmagine stessa che permette il s2i 
dai log infatti ho:
Using registry.access.redhat.com/openjdk/openjdk-11-rhel7@sha256:a55ede0c4b60edc130e7ecc54d34b695a8807c8b23dc85a3ef100964da1f65aa 
as the s2i builder image




