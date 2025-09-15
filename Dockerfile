FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/activemq-jms-template.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]

