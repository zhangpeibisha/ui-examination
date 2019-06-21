#!/usr/bin/env bash
# 关闭占用端口
run_port=10130
sudo fuser -k -n tcp ${run_port}
# 删除历史的images和container
docker stop ui-examination-container
docker rm ui-examination-container
docker rmi ui-examination
# 移动文件到目的位置
rm -f ui-examination.jar
cp ./target/ui-examination.jar ui-examination.jar
# 构建
docker build -t ui-examination .
docker run -d -p ${run_port}:${run_port} --name ui-examination-container ui-examination /bin/bash