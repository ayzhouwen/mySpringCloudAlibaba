# mySpringCloudAlibaba
基于ruoyi-cloud-搭建的极简脚手架，删掉很多无用的模块，包名换了，保留最核心的网关，认证，系统模块（只有用户），取消了ruoyi-cloud的多数据源，现在只支持单数据源，返璞归真，其他尽量保持与
ruoyi-cloud 一致，目前系统只有一个用户表，其他的功能以后可以从ruoyi-cloud照搬
#数据库
jyzn.sql 是业务库，只有一个sys_user

config_info.sql是nacos里的表数据，里边存的是application.yml 和限流的策略



