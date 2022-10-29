FROM openjdk:19
EXPOSE 8080
ADD target/jenkins-cicd.jar jenkins-cicd.jar
ENTRYPOINT ["java","-jar","/jenkins-cicd.jar"]