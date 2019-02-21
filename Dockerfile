FROM openjdk:8u171-alpine3.7
RUN apk --no-cache add curl
COPY target/point-a-ms*.jar point-a-ms.jar
CMD java ${JAVA_OPTS} -jar point-a-ms.jar