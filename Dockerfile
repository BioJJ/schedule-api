
FROM openjdk

WORKDIR /app

COPY target/play-with-docker-0.0.1-SNAPSHOT.jar /app/schedule-api.jar

ENTRYPOINT ["java", "-jar", "schedule-api.jar"]