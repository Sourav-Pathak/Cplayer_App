FROM openjdk:8
EXPOSE 8001
ADD ./target/user-0.0.1-SNAPSHOT.jar /usr/src/user-0.0.1-SNAPSHOT.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar","user-0.0.1-SNAPSHOT.jar"]