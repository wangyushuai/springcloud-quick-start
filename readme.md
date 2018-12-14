# 目录: Spring-Cloud2.x 整合全家桶及Netflix 组件
    author: yushuai_w@163.com
 ![Spring-Cloud截图](https://img-blog.csdnimg.cn/20181212194132161.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NodWFpX3d5,size_16,color_FFFFFF,t_70)

## 更新日志
20181214 : 初始化基础模块架构
## 文档结构说明
1. component 目录为 SpringCloud 组件整合

2. service 目录为业务服务目录，将模拟3个微服务(商品服务，订单服务，用户服务)，完成他们之间的项目调用、熔断、拉取配置等场景 

3. common-uitl 自定义通用工具包(Rest API 返回类型，API AOP 计时，json转换工具类，email, 自定义异常 等功能)