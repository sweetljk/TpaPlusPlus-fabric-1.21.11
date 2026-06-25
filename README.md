<div align="center">

# TPA++

**[English](#english) | [中文](#中文)**

一个高度可自定义的 Minecraft 传送请求模组——Fabric 1.21.11 移植版

A highly customizable Minecraft teleport request mod — ported to Fabric 1.21.11

[![Minecraft](https://img.shields.io/badge/Minecraft-1.21.11-brightgreen?style=flat-square)](https://minecraft.net)
[![Fabric](https://img.shields.io/badge/Fabric-0.19.2-yellow?style=flat-square)](https://fabricmc.net)
[![Kotlin](https://img.shields.io/badge/Kotlin-2.0.20-purple?style=flat-square)](https://kotlinlang.org)
[![License](https://img.shields.io/badge/License-MIT-blue?style=flat-square)](LICENSE)
[![Modrinth](https://img.shields.io/badge/Modrinth-TPA%2B%2B-00AF5C?style=flat-square)](https://modrinth.com/mod/tpa++)
[![CurseForge](https://img.shields.io/badge/CurseForge-TPA%2B%2B-F16436?style=flat-square)](https://www.curseforge.com/minecraft/mc-mods/tpaplusplus)

</div>

---

## 中文

基于 [SuperRicky14/TpaPlusPlus](https://github.com/SuperRicky14/TpaPlusPlus) 移植到 Fabric 1.21.11，并在原版基础上增加了点击接受、即时传送、跨维度传送等功能。

### 🆚 与原版的区别

| 特性 | 原版 | 本移植版 |
|---|---|---|
| 接受请求 | 手动输 `/tpaaccept` | **点击聊天消息即可接受** |
| 传送等待 | 接受后站定 5 秒 | **默认立即传送** |
| 跨维度传送 | 默认关闭 | **默认允许** |

### 📋 命令列表

| 命令 | 说明 |
|---|---|
| `/tpa <玩家>` | 请求传送到对方身边 |
| `/tpahere <玩家>` | 请求对方传送到你身边 |
| `/tpaaccept $<玩家>` | 接受请求（也可点击聊天消息） |
| `/tpadeny $<玩家>` | 拒绝请求 |
| `/tpacancel $<玩家>` | 取消发出的请求 |
| `/tptoggle` | 开关接收请求 |
| `/back` | 传送回上次死亡位置 |
| `/tpblock <玩家>` | 屏蔽某玩家 |
| `/tpunblock <玩家>` | 取消屏蔽 |
| `/tpaplusplus` | 管理命令（reload / version） |

### ✨ 特色功能

- **指令延迟** — 命令执行前的倒计时（可精确到小数）
- **移动检测** — 倒计时期间移动过远自动取消
- **距离限制** — 最大/最小传送距离
- **跨维度检查** — 默认允许，可配置关闭
- **指令冷却** — 可自定义每个命令的冷却时间
- **消息全自定义** — 支持颜色代码和 emoji
- **指令名可改** — 如把 `/tpa` 改成 `/chuan`（需重启）
- **配置热生效** — 修改配置文件无需重启服务器

### 📦 安装

1. 下载 `TPAPlusPlus-1.0.0+nightly.jar`
2. 放入 `mods` 文件夹
3. 确保安装了 **Fabric API** 和 **Fabric Language Kotlin**

配置文件位于 `config/tpaplusplus/tpaplusplus.toml`，大部分设置热生效。

### 🛠 开发

```bash
git clone <repo-url>
cd TpaPlusPlus-fabric-1.21.11
./gradlew build
```

详见 [CONTRIBUTING.md](CONTRIBUTING.md)。

---

## English

A Fabric 1.21.11 port of [SuperRicky14/TpaPlusPlus](https://github.com/SuperRicky14/TpaPlusPlus) with click-to-accept, instant teleport, and cross-dimension support.

### 🆚 Differences from Original

| Feature | Original | This Port |
|---|---|---|
| Accept request | Type `/tpaaccept` | **Click the chat message** |
| Teleport wait | 5-second stand still | **Instant by default** |
| Cross-dimension | Disabled by default | **Enabled by default** |

### 📋 Commands

| Command | Description |
|---|---|
| `/tpa <player>` | Request to teleport to a player |
| `/tpahere <player>` | Request a player to teleport to you |
| `/tpaaccept $<player>` | Accept a request (or click chat) |
| `/tpadeny $<player>` | Deny a request |
| `/tpacancel $<player>` | Cancel a request you sent |
| `/tptoggle` | Toggle receiving requests |
| `/back` | Teleport to last death location |
| `/tpblock <player>` | Block a player's requests |
| `/tpunblock <player>` | Unblock a player |
| `/tpaplusplus` | Admin command (reload / version) |

### ✨ Features

- **Windup delays** — countdown before execution (decimal precision)
- **Movement check** — cancels if player moves too far during windup
- **Range limits** — min/max teleport distances
- **Dimension checks** — configurable, enabled by default
- **Cooldowns** — per-command, per-player
- **Full message customization** — color codes, emoji support
- **Rename commands** — change `/tpa` to anything (requires restart)
- **Hot-reload config** — no server restart needed

### 📦 Installation

1. Download `TPAPlusPlus-1.0.0+nightly.jar`
2. Drop into `mods` folder
3. Requires **Fabric API** and **Fabric Language Kotlin**

Config: `config/tpaplusplus/tpaplusplus.toml`. Most settings hot-reload.

### 🛠 Development

```bash
git clone <repo-url>
cd TpaPlusPlus-fabric-1.21.11
./gradlew build
```

See [CONTRIBUTING.md](CONTRIBUTING.md) for detailed setup.

---

## 🙏 致谢 | Credit

- 原作者 [SuperRicky14](https://github.com/SuperRicky14) — [TPA++ 官方仓库](https://github.com/SuperRicky14/TpaPlusPlus)
- [官方 Wiki](https://github.com/SuperRicky14/TpaPlusPlus/wiki)
- 移植者 sweetljk · 本移植基于 MIT License

## 📄 许可证 | License

MIT License — 详见 [LICENSE](LICENSE)
