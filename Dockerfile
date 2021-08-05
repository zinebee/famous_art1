FROM openjdk:16
EXPOSE 8080
ADD target/famousart.jar  famousart.jar  
ENTRYPOINT ["java","-jar","/famousart.jar"]
