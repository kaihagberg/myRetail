#!/usr/bin/env bash

sh gradlew clean build -x test
java -jar ./build/libs/myretail-0.0.1-SNAPSHOT.jar
