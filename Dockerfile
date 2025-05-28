FROM openjdk:24-jdk-alpine

ADD target/student_mgmt.jar student_mgmt.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","student_mgmt.jar"]