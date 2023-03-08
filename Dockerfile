FROM adoptopenjdk/openjdk11:alpine-jre
EXPOSE 8080
ADD build/libs/ISS_project-0.0.1-SNAPSHOT.jar ISS_project-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/ISS_project-0.0.1-SNAPSHOT.jar"]

