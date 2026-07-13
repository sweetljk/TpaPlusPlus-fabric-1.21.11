# 更新日志 | Changelog

## [1.0.0] — 2026-06-25

### ✨ 新增 | Added

- Fabric 1.21.11 移植版首个发布
- 点击聊天消息即可接受传送请求（无需手动输入 `/tpaaccept`）
- 接受请求后即时传送，移除原版 5 秒等待
- 默认允许跨维度传送（地狱、末地）
- 基于 Kotlin 2.0.20 + Coroutines 的异步命令引擎
- TOML 配置文件，热重载支持（无需重启服务器）
- 三语言支持：简体中文（zh_cn，默认）、繁體中文（zh_tw）、English（en_us）
- 全命令可配置：启用/禁用、改名、延迟、冷却、距离限制
- 玩家数据 JSON 持久化（屏蔽列表、开关状态、死亡记录）
- 6 色 HEX 色板，全局样式一致

### 🔧 改进 | Changed

- 依赖 Konf（TOML 配置）+ Gson（JSON 数据），阴影化打包避免冲突
- 使用 Architectury API 事件系统
- 异步非阻塞 tick 循环默认开启

### 🐛 已修复 | Fixed（开发版）

- 修复 `getDimension()` 始终返回主世界，导致跨维度传送和下界坐标缩放完全失效
- 修复跨维度距离计算在非下界维度间（如主世界 ↔ 末地）返回无意义数值
- 修复 `getMutableText()` 对带样式文本参数调用 `toString()` 导致聊天消息显示原始组件结构
- 修复 `/tpaplusplus version` 中 GitHub/Modrinth/CurseForge 链接无法点击
- 修复非阻塞 tick 循环因 `launch {}` 包装导致协程叠加
- 修复全局拼写错误 `courseforge` → `curseforge`（含语言 key 重命名）
- 修复语言文件中半角逗号不一致（`,` → `，`）
- 修复 `PERMISSION_LEVEL` 常量为死代码
- 移除 `AcceptCommand` 中的死代码
- 移除 `ReloadCommand` 中无意义的 `.requires { true }` 权限检查空壳
- 移除 `Extensions.kt` 中未使用的 `ServerPlayerEntity` import
- 修复 CI：`setup-java` 和 `setup-gradle` 间的缓存冲突
- 修复 `sources`/`GITHUB_URL` 指向原始仓库而非本 fork
- 修复 Modrinth URL 中 `++` 未编码
- 修复 `.gitignore`、`gradle.properties`、`example.toml` 缺少末尾换行
- 修复 `fabric.mod.json` 中 `authors` 缺少移植者
- 修复 README 命令表格中 `$` 前缀为非标准格式
- 修复 `gradle.properties` 强制 TLSv1.2 限制
- 补充 `CHANGELOG.md` 版本比较引用链接
- 补充 `example.toml` 中标点规范提示注释

---

格式参考 [Keep a Changelog](https://keepachangelog.com/zh-CN/1.0.0/)。

[1.0.0]: https://github.com/sweetljk/TpaPlusPlus-fabric-1.21.11/releases/tag/v1.0.0
