FROM java:8

RUN apt-get update && apt-get install -y maven openjdk-7-jdk

RUN mvn package

EXPOSE 8761

ENTRYPOINT ["java","-jar","kr-eureak-0.0.1-SNAPSHOT.jar"]
