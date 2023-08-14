# Use the official OpenJDK image as the base image
FROM openjdk:17-jdk-slim-buster

WORKDIR /app

COPY target/authuser-0.0.1-SNAPSHOT.jar .

EXPOSE 8087

CMD ["java", "-jar", "authuser-0.0.1-SNAPSHOT.jar"]

