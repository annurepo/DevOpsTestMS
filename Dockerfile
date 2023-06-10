FROM openjdk:8
EXPOSE 8089
ADD target/DevOpsTestMS.jar DevOpsTestMS.jar
ENTRYPOINT ["java","-jar","/DevOpsTestMS.jar"]