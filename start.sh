#!/usr/bin/env bash

echo 'hello word'
run_port=8081
monitor_port=8082
java -jar -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=${monitor_port} learn.jar --server.port=${run_port}
