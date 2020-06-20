#!/usr/bin/env bash

echo "run all Started ...."

cdir=$(dirname "$0")
folderPath=$(cd ${cdir}; pwd -P)
cd "$folderPath"
cd ../../
rootPATH="$(pwd)"
echo "RootPath value is ............> $rootPATH"

cd $rootPATH/microservices/bankweb-service/config-onpremise
sh 02-run.sh

cd $rootPATH/microservices/commission-service/config-onpremise
sh 02-run.sh

cd $rootPATH/microservices/interest-service/config-onpremise
sh 02-run.sh

cd $rootPATH/microservices/payment-service/config-onpremise
sh 02-run.sh

echo "run all completed ...."