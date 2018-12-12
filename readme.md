# Spring-Cloud2.x 整合全家桶及Nefflix 组件
        author: yushuai_w@163.com

## 文档结构说明
1. component 目录为 SpringCloud 组件整合

2. service 目录为业务服务目录，将模拟3个微服务(商品服务，订单服务，用户服务)，完成他们之间的项目调用、熔断、拉取配置等场景 

3. common-uitl 自定义通用工具包(Rest API 返回类型，API AOP 计时，json转换工具类，email, 自定义异常 等功能)