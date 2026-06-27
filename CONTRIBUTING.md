# TPA++ 贡献指南 | Contributing Guide

## 环境要求 | Prerequisites

| 工具 | 版本 |
|---|---|
| **JDK** | 21+（推荐 Eclipse Temurin / Adoptium） |
| **IDE** | IntelliJ IDEA（Community 版即可） |
| **Gradle** | 项目自带 Wrapper，无需额外安装 |

## 快速开始 | Quick Start

```bash
# 1. 克隆仓库
git clone <repo-url>
cd TpaPlusPlus-fabric-1.21.11

# 2. （中国大陆用户）如有代理，取消 gradle.properties 中代理配置的注释

# 3. 用 IDEA 打开项目的 build.gradle.kts，等待 Gradle 同步完成

# 4. 构建
./gradlew build          # Windows
gradlew build            # 或直接用 IDEA 的 Gradle 面板

# 5. 代码检查
./gradlew detekt

# 6. 启动测试客户端
./gradlew runClient
```

## IDEA 设置 | IDEA Setup

1. `File → Settings → Build, Execution, Deployment → Build Tools → Gradle`
2. **Gradle JVM** 选择 **JDK 21**（没有的话点 Add SDK 添加）
3. **Build and run using** 设为 **Gradle**

## 中国大陆网络说明 | Network for Chinese Mainland

国外仓库在国内可能很慢或超时。如果你有代理（Clash/V2Ray 等），在 `gradle.properties` 中取消代理配置的注释并改为你的端口即可。

如果遇到 TLS 握手错误（`Remote host terminated the handshake`），在 `org.gradle.jvmargs` 的 `-Xmx2G` 后面加上 `-Dhttps.protocols=TLSv1.2`。

## 项目结构 | Project Structure

```
src/main/kotlin/net/superricky/tpaplusplus/
├── TpaPlusPlus.kt         # 模组入口
├── GlobalConst.kt         # 全局常量
├── async/                 # 异步命令引擎（协程）
├── command/commands/      # 用户命令实现
├── command/subcommands/   # 管理子命令
├── config/config/         # TOML 配置规范
├── config/language/       # 语言文件 / 国际化
├── database/              # 玩家数据持久化（JSON）
├── event/                 # 生命周期事件
└── utility/               # 工具类
```

## 提交指南 | Pull Request

- **不要修改** `detekt.yml` 代码风格规则
- **不要修改** Gradle 构建文件，除非明确需要
- 使用和现有代码一致的风格（命名、注释、缩进）
- 提交前运行 `./gradlew detekt` 确保通过代码检查
- 提交前运行 `./gradlew build` 确保能编译

## 调试技巧 | Debugging

在 IDEA 中右键 `TpaPlusPlus-fabric-1.21.11` → `Run 'TpaPlusPlus-fabric-1.21.11 [runClient]'`

或在终端：

```bash
./gradlew runClient --no-daemon
```

Fabric Loom 会自动下载 Minecraft 和所有依赖，启动带模组的开发环境。
