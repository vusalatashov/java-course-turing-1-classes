FROM openjdk:17

COPY target/course-application-1.0-SNAPSHOT.jar course-application.jar

CMD ["java","-jar","course-application.jar"]