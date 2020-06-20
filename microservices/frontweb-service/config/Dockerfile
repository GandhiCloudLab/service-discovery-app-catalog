FROM anapsix/alpine-java:8
WORKDIR /
ADD target/frontweb-service-0.0.1-SNAPSHOT.war app.war
RUN sh -c 'touch /app.war'
EXPOSE 9020
ENTRYPOINT ["java","-jar","/app.war"]
