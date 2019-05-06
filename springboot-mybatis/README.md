# MyBatis与SpringBoot整合案例

程序流程：

1. SpringBoot启动，自动读取schema.sql初始化内存数据库h2

2. 主启动类通过`@MapperScan("com.hehe.mapper")`找到接口类

3. MyBatis根据注解实现代理类

4. 完成。大家可以启动测试文件来验证一下


上面的案例是通过注解来实现接口的，如果想使用配置文件的话，
需要在application.yml中指明mapper文件的位置