# mySpringCloudAlibaba
精简版的ruoyi-cloud  

# 与ruoyi-cloud区别
* 1.与删掉很多无用的模块，包名换了，保留最核心的网关，认证，系统模块（只有用户），  
* 2.取消了ruoyi-cloud的多数据源，现在只支持单数据源，返璞归真，并且使用增加了mybatis plus支持
其他尽量保持与  
* 3.增加了hutool和lombok的支持  
* 4.目前业务系统只有一个用户表，其他的功能你如果需要以后可以从ruoyi-cloud照搬  

# 数据库
* jyzn.sql 是业务库，只有一个sys_user  
* config_info.sql是nacos里的表数据，里边存的是application.yml 和限流的策略  



