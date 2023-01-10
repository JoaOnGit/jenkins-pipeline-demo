FROM openjdk:11
EXPOSE 8080
ADD target/jenkins-pipeline-demo jenkins-pipeline-demo
ENTRYPOINT ["java", "-jar", "/jenkins-pipeline-demo"]