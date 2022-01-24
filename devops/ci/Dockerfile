FROM adoptopenjdk/openjdk11:jre-11.0.6_10-alpine


USER root



ADD ./target/*.jar /opt/sample24test-1.0.0.jar

CMD ["java", "-Xmx200m", "-jar", "/opt/sample24test-1.0.0.jar"]

EXPOSE 8080

