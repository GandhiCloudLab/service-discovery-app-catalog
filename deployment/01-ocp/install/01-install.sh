#!/usr/bin/env bash

cd ..

kubectl apply -f ./src --validate=false
