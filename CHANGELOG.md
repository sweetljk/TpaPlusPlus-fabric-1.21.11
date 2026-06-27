# 更新日志 | Changelog

## [1.0.0] — 2026-06-25

### ✨ 新增 | Added

- Fabric 1.21.11 移植版首个发布
- 点击聊天消息即可接受传送请求（无需手动输入 `/tpaaccept`）
- 接受请求后即时传送，移除原版 5 秒等待
- 默认允许跨维度传送（地狱、末地）
- 基于 Kotlin 2.0.20 + Coroutines 的异步命令引擎
- TOML 配置文件，热重载支持（无需重启服务器）
- 中/英文双语支持（zh_cn / zh_tw / en_us）
- 全命令可配置：启用/禁用、改名、延迟、冷却、距离限制
- 玩家数据 JSON 持久化（屏蔽列表、开关状态、死亡记录）

### 🔧 改进 | Changed

- 依赖 Konf（TOML 配置）+ Gson（JSON 数据），阴影化打包避免冲突
- 使用 Architectury API 事件系统

### 🐛 已知问题 | Known Issues

- 跨维度距离检查可能不准确
- 部分消息的文本样式可能丢失

---

格式参考 [Keep a Changelog](https://keepachangelog.com/zh-CN/1.0.0/)。
