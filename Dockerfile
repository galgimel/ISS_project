FROM openjdk:11
COPY . /java
WORKDIR /java
EXPOSE 80

#RUN javac IssProjectApplication.java
#CMD [ "java", "IssProjectApplication"]

#ARG JAR_FILE=gradle/wrapper/gradle-wrapper.jar
#COPY ${JAR_FILE} gradle-wrapper.jar
#ENTRYPOINT ["java", "-jar", "/gradle-wrapper.jar"]