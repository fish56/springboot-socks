## JSON XML
```java
    /**
     * 返回用户JSON
     */
    @GetMapping(value = "/user/json", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public User getJson() {
        return new User("1", "admin", "123456", new Date());
    }

    /**
     * 返回用户XML
     */
    @GetMapping(value = "/user/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public User getXml() {
        return new User("1", "admin", "123456", new Date());
    }
```

首先我们看一下produces，这其实是给就是给我们的响应体
设置ContentType
```java
 public static final String APPLICATION_JSON_UTF8_VALUE = "application/json;charset=UTF-8";
 public static final String APPLICATION_XML_VALUE = "application/xml";
```
MediaType中定义了一组字符串常量，它们都是符合HTTP协议规范的ContentType。

SpringMVC在处理响应的时候会根据ContentType来把Java对象转化为合适的字符串返回给客户端。


