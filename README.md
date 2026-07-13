<div align="center">

# TPA++

一个高度可自定义的 Minecraft 传送请求模组——Fabric 1.21.11 移植版  
*A highly customizable Minecraft teleport request mod — Fabric 1.21.11 port*

[![Minecraft](https://img.shields.io/badge/Minecraft-1.21.11-brightgreen?style=flat-square)](https://minecraft.net)
[![Fabric](https://img.shields.io/badge/Fabric-0.19.2-yellow?style=flat-square)](https://fabricmc.net)
[![Kotlin](https://img.shields.io/badge/Kotlin-2.0.20-purple?style=flat-square)](https://kotlinlang.org)
[![JDK](https://img.shields.io/badge/JDK-21-red?style=flat-square)](https://adoptium.net)
[![License](https://img.shields.io/badge/License-MIT-blue?style=flat-square)](LICENSE)
[![Modrinth](https://img.shields.io/badge/Modrinth-TPA%2B%2B-00AF5C?style=flat-square)](https://modrinth.com/mod/tpa%2B%2B)
[![CurseForge](https://img.shields.io/badge/CurseForge-TPA%2B%2B-F16436?style=flat-square)](https://www.curseforge.com/minecraft/mc-mods/tpaplusplus)

</div>

---

## 简介 | Introduction

基于 [SuperRicky14/TpaPlusPlus](https://github.com/SuperRicky14/TpaPlusPlus) 移植到 Fabric 1.21.11，在原版基础上增加了**点击接受、即时传送、跨维度传送**等功能。配置热生效，消息全可自定义。

*Ported from [SuperRicky14/TpaPlusPlus](https://github.com/SuperRicky14/TpaPlusPlus) to Fabric 1.21.11, with **click-to-accept, instant teleport, and cross-dimension support**. Hot-reload config, fully customizable messages.*

### 🆚 与原版的区别 | vs Original

| 特性 Feature | 原版 Original | 本移植版 This Port |
|---|---|---|
| 接受请求 Accept | 手动输 `/tpaaccept` | **点击聊天消息即可接受** Click-to-accept |
| 传送等待 Wait | 接受后站定 5 秒 | **默认立即传送** Instant by default |
| 跨维度 Cross-dim | 默认关闭 | **默认允许** Enabled by default |
| 语言 Language | 英文 only | **中文（zh_cn/zh_tw）+ 英文（en_us）** |
| 配置 Config | 需重启 | **热生效** Hot-reload |

---

## 📋 命令列表 | Commands

### 玩家命令 | Player Commands

| 命令 Command | 参数 Args | 说明 Description |
|---|---|---|
| `/tpa` | `<玩家>` | 请求传送到对方身边 Request to teleport to someone |
| `/tpahere` | `<玩家>` | 请求对方传送到你身边 Request someone to teleport to you |
| `/tpaaccept` | `[玩家]` | 接受传送请求（也可点击聊天消息）Accept request (or click chat) |
| `/tpadeny` | `[玩家]` | 拒绝传送请求 Deny request |
| `/tpacancel` | `[玩家]` | 取消发出的请求 Cancel sent request |
| `/tptoggle` | — | 开关接收请求 Toggle receiving requests |
| `/back` | — | 传送回上次死亡位置 Return to death location |
| `/tpablock` | `<玩家>` | 屏蔽某玩家 Block a player |
| `/tpaunblock` | `<玩家>` | 取消屏蔽某玩家 Unblock a player |

### 管理命令 | Admin Commands

| 命令 Command | 说明 Description |
|---|---|
| `/tpaplusplus` | 显示版本和项目链接 Show version & links |
| `/tpaplusplus version` | 显示版本信息（含可点击链接）Version with clickable links |
| `/tpaplusplus reload` | 重载语言文件 Reload language file |

---

## ✨ 特色功能 | Features

### 核心 | Core
- **点击接受** Click-to-accept — 接收者可直接点击聊天消息接受请求
- **即时传送** Instant teleport — 接受后默认立即传送（`waitTimeBeforeTp = 0.0`）
- **跨维度传送** Cross-dimension — 主世界 ↔ 地狱 ↔ 末地，下界坐标自动 8 倍缩放
- **死亡回溯** `/back` — 传送回死亡位置，跨维度支持

### 自定义 | Customization
- **指令延迟** Command delay — 执行前倒计时，精确到小数点后 3 位
- **移动检测** Move detection — 倒计时期间移动过远自动取消
- **距离限制** Distance limits — 最大/最小传送距离，跨维度可选忽略
- **指令冷却** Cooldown — 每个命令独立可配置冷却时间
- **指令别名** Rename commands — 所有命令名可自定义（如 `/tpa` → `/chuan`）
- **色板自定义** Color palette — 6 色 HEX 色板，全局生效
- **消息全自定义** Message customization — 所有消息文本可编辑，支持 emoji

### 技术 | Technical
- **配置热重载** Hot-reload — 修改配置文件即时生效，无需重启
- **异步引擎** Async engine — Kotlin Coroutines 驱动的非阻塞 tick 循环
- **数据持久化** Data persistence — JSON 自动保存（屏蔽列表、开关、死亡记录）
- **多语言** i18n — `zh_cn`（默认）、`zh_tw`、`en_us`，可自行添加语言

---

## 📦 安装 | Installation

### 前置依赖 | Requirements

| 模组 Mod | 说明 |
|---|---|
| **Fabric Loader** | >= 0.19.2 |
| **Fabric API** | >= 0.141.4+1.21.11 |
| **Fabric Language Kotlin** | >= 1.12.1+kotlin.2.0.20 |
| **Architectury API** | >= 19.0.1 |

### 步骤 | Steps

1. 下载 `TPAPlusPlus-1.0.0+nightly.jar`
2. 放入服务端（或客户端）的 `mods` 文件夹
3. 启动服务器，配置文件自动生成在 `config/tpaplusplus/tpaplusplus.toml`
4. 修改配置后执行 `/tpaplusplus reload` 即可生效（命令名/开关需重启）

### 配置文件位置 | Config Location

```
config/tpaplusplus/
├── tpaplusplus.toml    # 主配置文件
└── lang/
    ├── zh_cn.toml      # 简体中文（默认）
    ├── zh_tw.toml      # 繁體中文
    ├── en_us.toml      # English
    └── example.toml    # 自定义语言模板
```

玩家数据保存在存档目录下的 `tpaplusplus.json`。

---

## ⚙️ 配置速览 | Config Quick Reference

<details>
<summary>点击展开完整默认配置 | Click to expand</summary>

```toml
[common]
showBlockedMessage = true      # 屏蔽时通知被屏蔽者
toggledPlayerCommand = false   # 开关状态下是否允许发请求
tpaTimeout = 60.0              # 请求超时（秒），0 = 禁用
waitTimeBeforeTp = 0.0         # 传送前等待（秒），0 = 即时
language = "zh_cn"             # 语言：zh_cn / zh_tw / en_us

[common.color]                 # HEX 色板
primary = "#009688"            # 主色调
primaryVariant = "#52c7b8"     # 主色调变体
secondary = "#1e88e5"          # 次要色
secondaryVariant = "#6ab7ff"   # 次要色变体
error = "#d62929"              # 错误色
errorVariant = "#fb7171"       # 错误色变体

[advanced]
asyncLoopRate = 20             # tick 频率（次/秒）
unblockingTickLoop = true      # 异步 tick 循环
autoSaveInterval = 300         # 自动保存间隔（秒）

[command.enable]               # 命令开关（均默认 true）
backEnable = true
tpaEnable = true
tpahereEnable = true
tpacceptEnable = true
tpadenyEnable = true
tpacancelEnable = true
tpatoggleEnable = true
tpablockEnable = true
tpaunblockEnable = true

[command.name]                 # 命令别名（需重启）
tpaCommand = "tpa"
tpahereCommand = "tpahere"
tpacceptCommand = "tpaccept"
tpadenyCommand = "tpadeny"
tpacancelCommand = "tpacancel"
tpatoggleCommand = "tpatoggle"
backCommand = "back"
tpablockCommand = "tpablock"
tpaunblockCommand = "tpaunblock"

[command.delay]                # 执行延迟（秒），均默认 0.0
[command.cooldown]             # 冷却时间（秒），均默认 0.0
[command.distance]             # 移动容忍距离（格），均默认 0.0

[command.limitations]
crossDimAllowed = true         # 允许跨维度
maxTpDistance = 0.0            # 最大距离（0 = 禁用）
minTpDistance = 0.0            # 最小距离（0 = 禁用）
ignoreDistanceCrossDim = false # 跨维度忽略距离检查
```
</details>

---

## 🛠 开发 | Development

```bash
git clone https://github.com/sweetljk/TpaPlusPlus-fabric-1.21.11.git
cd TpaPlusPlus-fabric-1.21.11
./gradlew build        # 构建模组
./gradlew runClient    # 启动测试客户端
./gradlew detekt       # 静态代码检查
```

需要 **JDK 21**。详见 [CONTRIBUTING.md](CONTRIBUTING.md)。

*Requires JDK 21. See [CONTRIBUTING.md](CONTRIBUTING.md) for details.*

---

## 🙏 致谢 | Credits

- 原作者 Original author: [SuperRicky14](https://github.com/SuperRicky14) — [TPA++ 官方仓库](https://github.com/SuperRicky14/TpaPlusPlus)
- 移植者 Porter: **sweetljk**
- 本移植基于 MIT License | *This port is based on MIT License*

## 📄 许可证 | License

MIT License — 详见 [LICENSE](LICENSE)
