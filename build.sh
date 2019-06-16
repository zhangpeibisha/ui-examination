#!/usr/bin/env bash

# 关闭占用端口
run_port=8081
monitor_port=8082
jar_name="ui_examination.jar"

sudo fuser -k -n tcp ${run_port}
sudo fuser -k -n tcp ${monitor_port}

# 删除历史的images和container
docker stop examination-ui/container
docker rm examination-ui/container
docker rmi examination-ui

# 移动文件到目的位置
mv ./target/${jar_name} ${jar_name}

# 构建
docker bulid -t examination .
docker run -d -p ${run_port}:${run_port} -p ${monitor_port}:${monitor_port}  -v  --name examination-ui/container examination-ui /bin/bash