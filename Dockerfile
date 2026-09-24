FROM eclipse-temurin:17-jdk

COPY target/SWM7.jar /user/app

WORKDIR /user/app/

EXPOSE 8080

ENTRYPOINT [ "java","-jar","SWM7.jar" ]