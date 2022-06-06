FROM openjdk:11
COPY "./target/msclient-0.0.1-SNAPSHOT.jar" "msclient.jar"
EXPOSE 8081
ENTRYPOINT ["java","-jar","msclient.jar"]