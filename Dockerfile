FROM openjdk:11
ADD target/maven-docker-project.jar maven-docker-project.jar
ENTRYPOINT ["java", "-jar","maven-docker-project.jar"]
EXPOSE 8080