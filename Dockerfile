FROM openjdk:11
ADD target/pradhyuman99spemini.jar .
ENTRYPOINT ["java", "-jar","pradhyuman99spemini.jar"]
EXPOSE 8080