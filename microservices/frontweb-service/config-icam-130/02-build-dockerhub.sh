#!/usr/bin/env bash

echo "build Started ...."

# cd ..
# mvn clean package
# cd config-icam-130

cp ../target/bankweb-service-0.0.1-SNAPSHOT.jar app.jar

docker build -f ./Dockerfile -t gandhicloudlab/idepo-bankweb-icam-130:latest . --no-cache
#docker login -u gandhicloudlab
docker push gandhicloudlab/idepo-bankweb-icam-130:latest

echo "build completed ...."