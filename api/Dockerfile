FROM openjdk:8-jdk-alpine
RUN apk add bash
ADD target/app.jar app.jar
CMD ["java", "-jar", "app.jar"]
