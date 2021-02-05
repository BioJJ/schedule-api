
FROM openjdk

WORKDIR /app

COPY target/schedule-1.0-SNAPSHOT.jar /app/schedule-api.jar

ENTRYPOINT ["java", "-jar", "schedule-api.jar"]