#!/usr/bin/env bash

echo "build dockerhub all Started ...."

cdir=$(dirname "$0")
folderPath=$(cd ${cdir}; pwd -P)
cd "$folderPath"
cd ../../
rootPATH="$(pwd)"
echo "RootPath value is ............> $rootPATH"

#docker login -u gandigit

cd $rootPATH/microservices/frontweb-service/config-icam-130
sh 02-build-dockerhub.sh

cd $rootPATH/microservices/catalog-service/config-icam-130
sh 02-build-dockerhub.sh

cd $rootPATH/microservices/services-service/config-icam-130
sh 02-build-dockerhub.sh

cd $rootPATH/microservices/stock-service/config-icam-130
sh 02-build-dockerhub.sh

cd $rootPATH/microservices/storelocator-service/config-icam-130
sh 02-build-dockerhub.sh

echo "build dockerhub all completed ...."