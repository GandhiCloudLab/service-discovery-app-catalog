#!/usr/bin/env bash

echo "build Started ...."
pwd
ls -l

cd ..

#mvn clean package

docker build -f config/Dockerfile -t gandhicloudlab/servicediscovery-catalog:latest .  --no-cache
# docker login -u gandhicloudlab
docker push gandhicloudlab/servicediscovery-catalog:latest

echo "build completed ...."