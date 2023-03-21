FROM openjdk:11
ADD target/pradhyuman99/speminiproject pradhyuman99/speminiproject
ENTRYPOINT ["java", "-jar","pradhyuman99/speminiproject"]
EXPOSE 8080pradhyuman99/speminiproject
