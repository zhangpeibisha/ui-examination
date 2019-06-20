#!/usr/bin/env bash

echo 'hello word'
run_port=10130
monitor_port=10120
jarName="ui-examination.jar"

sudo fuser -k -n tcp ${run_port}
sudo fuser -k -n tcp ${monitor_port}
java -jar -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=${monitor_port}  ${jarName} --server.port=${run_port}
