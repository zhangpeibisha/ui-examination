
FROM hub.c.163.com/housan993/centos7_jdk8

MAINTAINER zhangpei

RUN mkdir -p /usr/loacl/web

# 将文件放入到容器中
COPY ./ui-examination.jar  /usr/local/web/ui-examination.jar
COPY ./start.sh  /usr/local/web/start.sh

# 给脚本权限
RUN chmod 777  /usr/local/web/start.sh

# 进入工作目录，并执行命令
WORKDIR   /usr/local/web
ENTRYPOINT ["./start.sh"]

