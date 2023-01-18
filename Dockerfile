FROM openjdk:8
EXPOSE 8080
ADD target/week7day2.jar week7day2.jar
ENTRYPOINT ["java","-jar","/week7day2.jar"]