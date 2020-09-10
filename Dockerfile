FROM openjdk:14-jdk-oraclelinux7
VOLUME /tmp
ADD target/menu-jar-with-dependencies.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]