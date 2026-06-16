# TPA++ — Minecraft 1.21.11 Fabric 移植版

基于 [SuperRicky14/TpaPlusPlus](https://github.com/SuperRicky14/TpaPlusPlus) 修改的 Fabric 1.21.11 移植版本，在原版基础上增加了点击接受、零等待传送等功能。

## 与官方版的区别

- **点击聊天消息接受 TPA** — 收到传送请求后，点击聊天气泡即可自动执行 `/tpaccept`，无需手动输入指令
- **零等待传送** — 默认取消传送前 5 秒站定等待，接受请求后即刻传送
- **跨维度传送** — 默认允许在不同维度间传送（地狱、末地等）

## 原版功能

所有原版 TPA++ 的功能均保留，包括：

`/tpa [玩家]` · 发送传送请求
`/tpahere [玩家]` · 请求对方传送到你身边
`/tpaaccept $[玩家]` · 接受传送请求（也可点击聊天消息接受）
`/tpadeny $[玩家]` · 拒绝传送请求
`/tpacancel $[玩家]` · 取消你发出的传送请求
`/tptoggle` · 开关是否接收传送请求
`/back` · 传送回上一次死亡地点
`/tpblock [玩家]` · 屏蔽某玩家的传送请求
`/tpunblock [玩家]` · 取消屏蔽
`/tpaplusplus` · 服务端管理命令

### 原版特色功能

- **指令延迟** · 控制指令执行的等待时间（精确到小数）
- **延迟距离限制** · 指令等待期间允许移动的最大范围
- **距离检查** · 控制传送的最小/最大距离
- **跨维度检查** · 本移植版默认开启
- **消息自定义** · 完全自定义 mod 的所有提示消息（支持颜色代码、emoji 等）
- **指令名自定义** · 可任意修改指令名称（如 `/tpa` 改成 `/chuan`）
- **指令冷却** · 控制同一指令的使用间隔

## 安装

1. 下载 `TPAPlusPlus-1.0.0+nightly.jar`
2. 放入 `.minecraft/versions/1.21.11-Fabric 0.19.2/mods/`
3. 需要 **Fabric API** 和 **Fabric Language Kotlin** 作为前置

配置文件在 `config/tpaplusplus/tpaplusplus.toml`，大部分配置项热生效无需重启。

## Credit

- 原作者：[SuperRicky14](https://github.com/SuperRicky14) — [TPA++ 官方仓库](https://github.com/SuperRicky14/TpaPlusPlus)
- 官方 Wiki：[TPA++ Wiki](https://github.com/SuperRicky14/TpaPlusPlus/wiki)
- 本移植基于 MIT License，与原项目保持一致

## License

MIT License — 详见 [LICENSE](LICENSE)
