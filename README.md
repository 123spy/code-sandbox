# 代码沙箱服务

> 作者：程序员spy

本项目实现了一个代码砂箱，用户可以通过网络请求，将要执行的的代码发送给沙箱。沙箱将会编译运行，最后返回结果。

## 技术栈
- Java
- Spring Boot
- Docker
- Docker-Java
- Lombok

## 项目特点
- 支持C++、Java程序执行
- 封装返回结果
- 使用Docker-Java实现java控制Docker容器
- 使用Docker执行程序，避免恶意程序
- 静态工厂模式优化代码
- 使用StringBuffer优化Docker输出流

