FROM openjdk:8-jdk

EXPOSE 8080
COPY target/fede-0.0.1-SNAPSHOT.jar fede-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/fede-0.0.1-SNAPSHOT.jar"]