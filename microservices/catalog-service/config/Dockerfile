FROM anapsix/alpine-java:8
WORKDIR /
ADD target/catalog-service-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 9021
ENTRYPOINT ["java","-jar","/app.jar"]
