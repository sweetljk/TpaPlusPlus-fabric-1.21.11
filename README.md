# TPA++ — Minecraft 1.21.11 Fabric Port | Minecraft 1.21.11 Fabric 移植版

Based on [SuperRicky14/TpaPlusPlus](https://github.com/SuperRicky14/TpaPlusPlus), ported to Fabric 1.21.11 with additional features including click-to-accept, instant teleport, and cross-dimension support.
基于 [SuperRicky14/TpaPlusPlus](https://github.com/SuperRicky14/TpaPlusPlus) 修改的 Fabric 1.21.11 移植版本，在原版基础上增加了点击接受、零等待传送、跨维度传送等功能。

## Differences from the Original | 与原版的区别

- **Click-to-Accept TPA** · Click the chat message to automatically run `/tpaccept`, no need to type the command manually
  **点击聊天消息接受 TPA** · 收到传送请求后，点击聊天气泡即可自动执行 `/tpaccept`，无需手动输入指令
- **Instant Teleport** · Removed the default 5-second wait before teleport, teleport happens instantly upon acceptance
  **零等待传送** · 默认取消传送前 5 秒站定等待，接受请求后即刻传送
- **Cross-Dimension Enabled by Default** · Teleport between dimensions (Nether, End, etc.) is allowed out of the box
  **跨维度传送** · 默认允许在不同维度间传送（地狱、末地等）

## Original Features | 原版功能

All original TPA++ features are preserved:
所有原版 TPA++ 的功能均保留：

`/tpa [player]` · Sends a teleport request to a player | 发送传送请求
`/tpahere [player]` · Requests a player to teleport to you | 请求对方传送到你身边
`/tpaaccept $[player]` · Accepts a teleport request (or click the chat message) | 接受传送请求（也可点击聊天消息接受）
`/tpadeny $[player]` · Denies a teleport request | 拒绝传送请求
`/tpacancel $[player]` · Cancels a teleport request you sent | 取消你发出的传送请求
`/tptoggle` · Toggles receiving teleport requests on/off | 开关是否接收传送请求
`/back` · Teleports to your last death location | 传送回上一次死亡地点
`/tpblock [player]` · Blocks a player from sending you teleport requests | 屏蔽某玩家的传送请求
`/tpunblock [player]` · Unblocks a player | 取消屏蔽
`/tpaplusplus` · Server management command | 服务端管理命令

### Key Features | 特色功能

- **Command Windups** · Controls how long any command takes to execute (supports decimals)
  **指令延迟** · 控制指令执行的等待时间（精确到小数）
- **Windup Distance** · How far a player can move during the countdown
  **延迟距离限制** · 指令等待期间允许移动的最大范围
- **Range Checks** · Min/max distance between players for teleport requests
  **距离检查** · 控制传送的最小/最大距离
- **Dimension Checks** · Enabled by default in this port
  **跨维度检查** · 本移植版默认开启
- **Message Control** · Customize every message sent by the mod (color codes, emoji, full rewrites)
  **消息自定义** · 完全自定义 mod 的所有提示消息（支持颜色代码、emoji 等）
- **Command Control** · Rename any command (e.g. change `/tpa` to `/whatever`)
  **指令名自定义** · 可任意修改指令名称（如 `/tpa` 改成 `/chuan`）
- **Command Cooldowns** · Controls the interval before reusing the same command
  **指令冷却** · 控制同一指令的使用间隔

## Installation | 安装

1. Download `TPAPlusPlus-1.0.0+nightly.jar` | 下载 `TPAPlusPlus-1.0.0+nightly.jar`
2. Place in `.minecraft/versions/1.21.11-Fabric 0.19.2/mods/` | 放入 `.minecraft/versions/1.21.11-Fabric 0.19.2/mods/`
3. Requires **Fabric API** and **Fabric Language Kotlin** | 需要 **Fabric API** 和 **Fabric Language Kotlin** 作为前置

Configuration file: `config/tpaplusplus/tpaplusplus.toml`. Most settings take effect without restarting.
配置文件在 `config/tpaplusplus/tpaplusplus.toml`，大部分配置项热生效无需重启。

## Credit | 致谢

- Original author | 原作者：[SuperRicky14](https://github.com/SuperRicky14) — [TPA++ Official Repo | 官方仓库](https://github.com/SuperRicky14/TpaPlusPlus)
- Official Wiki | 官方 Wiki：[TPA++ Wiki](https://github.com/SuperRicky14/TpaPlusPlus/wiki)
- This port is licensed under the MIT License, same as the original project | 本移植基于 MIT License，与原项目保持一致

## License | 许可证

MIT License — see [LICENSE](LICENSE) | 详见 [LICENSE](LICENSE)
