#!/bin/sh
cd /code
mvn install
java -jar target/blueprint-0.0.1-SNAPSHOT.jar