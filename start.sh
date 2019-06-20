#!/usr/bin/env bash

echo 'hello word'
run_port=10130

jarName="ui-examination.jar"
echo ${run_port}

java -jar ${jarName} --server.port=${run_port}
