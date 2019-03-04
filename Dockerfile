FROM openjdk:8
ADD target/docker/docker-learn.jar docker-learn.jar
ENTRYPOINT ["java", "-jar", "docker-learn.jar"]