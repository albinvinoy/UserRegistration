FROM openjdk:8-alpine
RUN apk add --no-cache curl tar bash
RUN mkdir -p /build
WORKDIR /build
COPY pom.xml /build
COPY src /build/src
RUN "mvn clean install"
ENTRYPOINT [ "java", "-jar", "app.jar" ]