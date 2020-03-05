FROM openjdk
FROM openjdk:8
EXPOSE 9000
ADD target/myfirstservice.jar myfirstservice.jar
ENTRYPOINT ["java","-jar","myfirstservice.jar"]