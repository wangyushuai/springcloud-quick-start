# 目录: Spring-Cloud2.x 整合全家桶及Netflix 组件

 ![Spring-Cloud截图](https://img-blog.csdnimg.cn/20181212194132161.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NodWFpX3d5,size_16,color_FFFFFF,t_70)

## 更新日志
20190626 ：SpringCloud 整合Consul 服务发现（consul-order-service, consul-product-service）

20190626 ： Fix RestResponse.java BUG;

20190419 ： 添加前台页面 front-page 模块

20181217 : SpringCloud 整合Hystrix2.1.0(熔断&服务降级)

20181214 : 初始化基础模块架构

author: **yushuai_w@163.com**
## 项目亮点
1. 通用工具部分(common-util)：封装了部分业务场景的实用工具类(如：AOP API计时, Restful响应模型, 读取服务器配置工具类, JSON工具类, 异常工具类等),大家可以直接copy使用。

2. 组件部分(component)： 整合了SpringCloud全家桶及Netflix组件(Eureka,Zuul,Hystrix,Ribbon,Feign,Consul等组件)

3. 微服务部分(service)： 采用了三个典型的业务场景Demo(订单服务,产品服务,用户服务，通用实体集)，模拟了服务间的调用（Feign,Rebbion)，服务熔断(hystrix)等场景

4. 项目架构：项目结构采用了合理的Maven聚合工程设计, 各微服务依赖于父Service,通过父Service控制各模块依赖版本

## 代码目录结构说明
1. component 目录为 SpringCloud 组件整合(Eureka,Zuul,Hystrix,Ribbon,Feign)

2. service 目录为业务服务目录，将模拟3个微服务(商品服务，订单服务，用户服务)，完成他们之间的项目调用、熔断、拉取配置等场景 

3. common-uitl 自定义通用工具包(Rest API 返回类型，API AOP 计时，json转换工具类，email, 自定义异常 等功能)