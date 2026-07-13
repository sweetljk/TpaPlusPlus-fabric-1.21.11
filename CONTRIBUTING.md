# TPA++ 贡献指南 | Contributing Guide

## 环境要求 | Prerequisites

| 工具 Tool | 版本 Version |
|---|---|
| **JDK** | 21+（推荐 Eclipse Temurin / Adoptium） |
| **IDE** | IntelliJ IDEA（Community 版即可） |
| **Gradle** | 项目自带 Wrapper，无需额外安装 |

## 快速开始 | Quick Start

```bash
# 1. 克隆仓库 | Clone
git clone https://github.com/sweetljk/TpaPlusPlus-fabric-1.21.11.git
cd TpaPlusPlus-fabric-1.21.11

# 2. 构建 | Build
./gradlew build

# 3. 代码检查 | Lint
./gradlew detekt

# 4. 启动测试客户端 | Run test client
./gradlew runClient
```

## IDEA 设置 | IDE Setup

1. `File → Settings → Build, Execution, Deployment → Build Tools → Gradle`
2. **Gradle JVM** 选择 **JDK 21**（没有的话点 Add SDK 添加）
3. **Build and run using** 设为 **Gradle**

## 中国大陆网络说明 | Network Tips for China

国外仓库在国内可能很慢或超时。如果你有代理（Clash/V2Ray 等），在 `gradle.properties` 中取消代理配置的注释并改为你的端口即可。

*If you experience slow downloads, uncomment the proxy settings in `gradle.properties` and set your proxy host/port.*

如果遇到 TLS 握手错误（`Remote host terminated the handshake`），在 `org.gradle.jvmargs` 的 `-Xmx2G` 后面加上 `-Dhttps.protocols=TLSv1.2`。

*For TLS handshake errors, append `-Dhttps.protocols=TLSv1.2` to `org.gradle.jvmargs`.*

## 项目结构 | Project Structure

```
src/main/kotlin/net/superricky/tpaplusplus/
├── TpaPlusPlus.kt           # 模组入口 Mod entry point
├── GlobalConst.kt           # 全局常量 Global constants
├── async/                   # 异步命令引擎 Async command engine (Coroutines)
├── command/commands/        # 用户命令 Player commands
├── command/subcommands/     # 管理子命令 Admin subcommands
├── config/config/           # TOML 配置规范 Config spec
├── config/language/         # 语言文件 / 国际化 Language / i18n
├── database/                # 玩家数据持久化 Player data (JSON)
├── event/                   # 生命周期事件 Lifecycle events
└── utility/                 # 工具类 Utilities
```

## 提交指南 | Commit Guidelines

- **不要修改** `detekt.yml` 代码风格规则 | *Do not modify* `detekt.yml`
- **不要修改** Gradle 构建文件，除非明确需要 | *Don't change build files unless necessary*
- 使用和现有代码一致的风格（命名、注释、缩进） | *Match existing code style*
- 提交前运行 `./gradlew detekt` 确保通过代码检查 | *Run detekt before commit*
- 提交前运行 `./gradlew build` 确保能编译 | *Run build before commit*

## 添加新语言 | Adding a Language

1. 复制 `src/main/resources/lang/example.toml` → `src/main/resources/lang/<语言代码>.toml`
2. 翻译所有值（保留 key 名称和 `%s` 占位符）
3. 在 `LanguageConfig.kt` 的 `supportedLanguage` 列表中添加你的语言代码
4. 如需作为默认语言，修改 `GlobalConst.kt` 中的 `DEFAULT_LANG_FILE_NAME`
5. 构建并测试：`./gradlew build`

*Copy `example.toml`, translate values (keep keys and `%s`), add to `supportedLanguage`, build & test.*

## 调试技巧 | Debugging

在 IDEA 中右键 `TpaPlusPlus-fabric-1.21.11` → `Run 'TpaPlusPlus-fabric-1.21.11 [runClient]'`

或在终端 | *or in terminal*：

```bash
./gradlew runClient --no-daemon
```

Fabric Loom 会自动下载 Minecraft 和所有依赖，启动带模组的开发环境。  
*Fabric Loom downloads Minecraft & dependencies automatically.*
