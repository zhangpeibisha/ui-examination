#!/usr/bin/env bash

echo 'hello word'
run_port=10120
monitor_port=10130
jarName="ui-examination.jar"

java -jar -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=${monitor_port}  ${jarName} --server.port=${run_port}
