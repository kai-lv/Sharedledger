#基于Spring Data Jpa的共享账单  

##项目简介
本项目实现了一个简单的共享账单系统的后端，项目主要实现的是多个用户对同一个账单进行编辑，利用session和jpa的审计功能自动填写账单中条目的创建者和创建时间。主要实现的功能为：
1.	用户信息的增删改查
2.	用户通过用户名及密码登录
3.	对账单条目进行增删改查

使用到了框架为：Spring Boot、Spring MVC、Spring Data Jpa， 使用maven来管理项目，集成开发环境为：Idea、Docker、MySQL和Postman。
使用到的数据库为MySQL，建立了两个表：LUser和Ledger。 表LUser中存放用户信息，其中UserId为用户ID，属性设置为自增策略，Name和Password为用户名及密码，
由用户自行输入，表Ledger中存放账单信息，其中Id为账单条目ID，属性设置为自增策略，Item、Money、Type为账单条目，金额，类型，由用户自行输入，
CreateBy和CreateDate为创建人和创建时间，利用Jpa的审记功能自动注入。


##集成开发环境
1. Idea
2. Docker
3. MySQL
4. Postman

##依赖包
1. spring-boot-starter
2. spring-boot-starter-test
3. spring-boot-starter-web——web模块
4. spring-boot-starter-data-jpa——jpa
5. druid-spring-boot-starter——druid连接池
6. mysql-connector-java——mysql
7. lombok
8. jackson-databind——数据格式

##目录解释
* common.config.LedgerUser——将当前的用户的session提交给jpa的审计
* controller——控制层
* model——用于存放实体类
* repository——使用jpa生成的repository接口
* service——提供的一些服务接口
* service.impl——服务接口的实现


##项目启动
1. 打开Docker启动数据库MySQL
2. 使用Idea打开项目文件夹，更改application.yml中的username和password为当前数据库的名称和密码
3. 使用Idea运行项目，使用postman进行查看与调试,端口号为2334



