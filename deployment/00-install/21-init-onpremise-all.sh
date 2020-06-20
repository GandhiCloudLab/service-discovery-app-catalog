#!/usr/bin/env bash

echo "init all Started ...."

cdir=$(dirname "$0")
folderPath=$(cd ${cdir}; pwd -P)
cd "$folderPath"
cd ../../
rootPATH="$(pwd)"
echo "RootPath value is ............> $rootPATH"


echo "bankweb ........................................................................> started"

cd $rootPATH/microservices/bankweb-service/config-onpremise
sh 01-init.sh

echo "bankweb ........................................................................> completed"
echo "commission ........................................................................> started"

cd $rootPATH/microservices/commission-service/config-onpremise
sh 01-init.sh

echo "commission ........................................................................> started"
echo "interest ........................................................................> completed"

cd $rootPATH/microservices/interest-service/config-onpremise
sh 01-init.sh

echo "interest ........................................................................> completed"
echo "payment ........................................................................> started"

cd $rootPATH/microservices/payment-service/config-onpremise
sh 01-init.sh

echo "payment ........................................................................> completed"

echo "init all completed ...."