# spring-boot-lab-docker

## 介绍

### Jib

项目使用 [jib-maven-plugin](https://github.com/GoogleContainerTools/jib/tree/master/jib-maven-plugin) 插件用于打包和推送
Docker 镜像。

#### 优点

这个插件的主要优点如下：

1. 不需要部署 Docker 环境。
2. 自动完成打包和推送镜像流程。

#### 操作

使用以下命令自动完成打包镜像并推送到阿里云容器镜像服务。

```bash
mvn compile jib:build \
    -Djib.to.auth.username=$USERNAME \
    -Djib.to.auth.password=$PASSWORD
```

## 运行

```bash
docker run --network=host registry.cn-hangzhou.aliyuncs.com/inlym/spring-boot-lab-docker:latest
```
