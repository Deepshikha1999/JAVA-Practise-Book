FROM openjdk:8
ARG JAR_FILE=target/hello-boot.jar
COPY ${JAR_FILE} hello-boot.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/hello-boot.jar"]