#!/usr/bin/env bash
BASE=/media/vdb/code/springboot-angularjs
deploy_path=${BASE}
cd ${BASE}
mvn clean install -DskipTests
cd ${deploy_path}
rm -f *.jar
mv ${BASE}/target/*.jar .

docker build -t spring-angular -f dockerfile .
#docker-compose up -d
