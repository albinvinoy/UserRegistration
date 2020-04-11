FROM openjdk:8-jdk-alpine
RUN apk add bash
ADD target/app.jar app.jar
CMD ["java", "-Dspring.data.mongodb.uri=mongodb://springboot-mongo:27017/springmongo-demo", "-jar", "app.jar"]