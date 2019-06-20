#!/usr/bin/env bash

# 关闭占用端口
run_port=10130
monitor_port=10120
jar_name="ui-examination.jar"

sudo fuser -k -n tcp ${run_port}

# 删除历史的images和container
docker stop ui-examination-container
docker rm ui-examination-container
docker rmi ui-examination

# 移动文件到目的位置
pwd
rm -f ${jar_name}
mv ./target/${jar_name} ${jar_name}

# 构建
docker build -t ui-examination .
docker run -d -p ${run_port}:${run_port} --name ui-examination-container ui-examination /bin/bash
