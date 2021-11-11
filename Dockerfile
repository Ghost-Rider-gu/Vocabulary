FROM java:8-jre
MAINTAINER Iurii Golubnichenko <ghostrider.gu@gmail.com>

ARG JAR_FILE
COPY ${JAR_FILE} verbarium.jar
CMD ["java", "-jar", "/verbarium.jar"]

HEALTHCHECK --interval=30s --timeout=30s CMD curl -f http://localhost:8090/actuator/health || exit 1

EXPOSE 8090