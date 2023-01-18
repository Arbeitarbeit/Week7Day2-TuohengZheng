FROM openjdk:8
EXPOSE 8080
ADD target/week7day2.war week7day2.war
ENTRYPOINT ["java","-jar","/week7day2.war"]