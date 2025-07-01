FROM openjdk:21-jdk-slim
VOLUME /tmp
COPY target/*.jar myapp.jar
ENTRYPOINT ["java","-jar","/myapp.jar"]