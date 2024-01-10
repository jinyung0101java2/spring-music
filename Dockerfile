FROM appinair/jdk11-maven
COPY ../build/spring-music-1.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
