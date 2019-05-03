# SpringBoot 多模块化划分

### 如何运行本项目？
1. 本地安装MySQL，且监听3306
2. 执行initDB.sql，初始化数据库
3. 启动mm-web下的主程序就行了


启动后你访问/users后，会返现返回值是个空列表,

然后你再访问/users/{username}，它会创建一个新的记录，

然后返回users，你就会发现创建了新的记录

### 如何打包运行？

https://www.jianshu.com/p/59ceea4f029d
