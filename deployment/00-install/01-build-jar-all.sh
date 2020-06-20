#!/usr/bin/env bash

echo "build all Started ...."

cdir=$(dirname "$0")
folderPath=$(cd ${cdir}; pwd -P)
cd "$folderPath"
cd ../../
rootPATH="$(pwd)"
echo "RootPath value is ............> $rootPATH"

cd $rootPATH/microservices/frontweb-service
mvn clean package

cd $rootPATH/microservices/catalog-service
mvn clean package

cd $rootPATH/microservices/services-service
mvn clean package

cd $rootPATH/microservices/stock-service
mvn clean package

cd $rootPATH/microservices/storelocator-service
mvn clean package

echo "build all completed ...."