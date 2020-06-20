#!/usr/bin/env bash

echo "build Started ...."
pwd
ls -l

cd ..

#mvn clean package

docker build -f config/Dockerfile -t gandhicloudlab/servicediscovery-frontweb:latest .  --no-cache
# docker login -u gandhicloudlab
docker push gandhicloudlab/servicediscovery-frontweb:latest

echo "build completed ...."