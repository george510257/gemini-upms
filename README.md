## 项目介绍

- 项目名称：gemini-upms
- 项目描述：用户权限服务

## 项目结构

```lua
─ gemini-upms
├─db
├─gemini-upms-boot -- 启动模块
│  └─src
│     └─main
│        ├─java
│        │  └─com.gls.gemini.upms.boot
│        │     ├─job
│        │     ├─kafka
│        │     └─web
│        │        ├─controller -- 控制器
│        │        ├─converter -- 转换器
│        │        ├─entity -- 实体
│        │        ├─mapper -- mapper
│        │        └─service -- 服务
│        └─resources
│           └─mapper -- mapper文件
└─gemini-upms-sdk -- sdk模块
   └─src
      └─main
         ├─java
         │  └─com.gls.gemini.upms.sdk
         │     ├─feign -- feign
         │     └─vo -- vo
         └─resources
            └─META-INF
               └─spring -- spring配置文件
```