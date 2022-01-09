FROM openjdk:8-jdk-alpine
RUN apk --update add tzdata && \
    cp /usr/share/zoneinfo/America/Argentina/Buenos_Aires /etc/localtime && \
    apk del tzdata && \
    rm -rf /var/cache/apk/*

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]