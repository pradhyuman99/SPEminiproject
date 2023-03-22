FROM openjdk:11
ADD target/calculator-1.0-SNAPSHOT-jar-with-dependencies.jar .
ENTRYPOINT ["java", "-jar","calculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]
EXPOSE 8080