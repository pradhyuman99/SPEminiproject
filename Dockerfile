FROM openjdk:11
ADD target/pradhyuman99/speminiproject.jar pradhyuman99/speminiproject.jar
ENTRYPOINT ["java", "-jar","pradhyuman99/speminiproject.jar"]
EXPOSE 8080