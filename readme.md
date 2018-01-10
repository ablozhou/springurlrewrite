# 说明
这是一个urlrewrite的使用程序。功能类似apache mod_rewrite.
https://github.com/ablozhou/urlrewritefilter

from:

    A Java Web Filter with functionality like Apache's mod_rewrite http://tuckey.org/urlrewrite/

基于该urlrewrite，spring boot的使用方法

# 测试
在hosts 中添加
```
127.0.0.1       test.com
127.0.0.1       a.test.com
127.0.0.1       b.test.com
```
# 运行
IDE 导入build.gradle
执行MainController

或者执行
gradlew build

# 访问
浏览器中访问http://a.test.com/test，
会跳转到http://test.com/a/test

这样可以某种程度支持多租户

http://localhost:8080/rewrite-status
可以看到相关url重写信息
