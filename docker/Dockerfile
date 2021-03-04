FROM openjdk:15-alpine
WORKDIR /usr/src/demoapp
COPY build/libs/demo-0.0.1-SNAPSHOT.jar .

EXPOSE 9090
ENTRYPOINT ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]
