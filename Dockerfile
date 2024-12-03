FROM openjdk:22-jdk
EXPOSE 8080
ADD target/Springbootjenkins-0.0.1-SNAPSHOT.jar Springbootjenkins-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Springbootjenkins-0.0.1-SNAPSHOT.jar"]