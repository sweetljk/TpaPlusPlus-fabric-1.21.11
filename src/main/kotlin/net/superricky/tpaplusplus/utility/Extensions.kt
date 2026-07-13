package net.superricky.tpaplusplus.utility
import net.minecraft.world.World

import com.uchuhimo.konf.RequiredItem
import kotlinx.coroutines.launch
import net.minecraft.entity.player.PlayerEntity

import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.text.MutableText
import net.minecraft.text.Style
import net.minecraft.text.Text
import net.minecraft.util.Identifier
import net.superricky.tpaplusplus.TpaPlusPlus
import net.superricky.tpaplusplus.config.config.Config
import net.superricky.tpaplusplus.config.language.CooldownSpec
import net.superricky.tpaplusplus.config.language.LanguageConfig.getMutableText
import net.superricky.tpaplusplus.config.language.TeleportSpec
import net.superricky.tpaplusplus.config.language.WindupSpec

fun String.literal(): MutableText = Text.literal(this)
fun String.translate(): MutableText = Text.translatable(this)
fun String.toDimensionKey(): ServerDimension =
    RegistryKey.of(RegistryKeys.WORLD, Identifier.of(this))

fun PlayerEntity.toggleOn() = TpaPlusPlus.launch {
    TpaPlusPlus.dataService.playerSwitchToggle(uuid, true)
}

fun PlayerEntity.toggleOff() = TpaPlusPlus.launch {
    TpaPlusPlus.dataService.playerSwitchToggle(uuid, false)
}

fun PlayerEntity.getColoredName(color: Style): MutableText? = this.name.literalString?.literal()?.setStyle(color)
fun PlayerEntity.getDimension(): ServerDimension = this.getEntityWorld().getRegistryKey()

fun PlayerEntity.sendMessageWithPlayerName(
    translateKey: RequiredItem<String>,
    player: PlayerEntity,
    outStyle: Style = TextColorPallet.primary,
    inStyle: Style = TextColorPallet.secondary
) {
    this.sendMessage(
        translateKey.getMutableText(
            player.getColoredName(inStyle)
        ).setStyle(outStyle), false
    )
}

fun PlayerEntity.sendRemainTime(
    time: Double,
    outStyle: Style = TextColorPallet.primary,
    inStyle: Style = TextColorPallet.secondary
) {
    this.sendMessage(
        WindupSpec.remain.getMutableText(
            String.format("%.1f", time).literal().setStyle(inStyle)
        ).setStyle(outStyle), false
    )
}

fun PlayerEntity.sendCooldownTime(
    commandName: String,
    time: Double,
    outStyle: Style = TextColorPallet.primary,
    inStyle: Style = TextColorPallet.secondary
) {
    this.sendMessage(
        CooldownSpec.underCooldown.getMutableText(
            commandName.literal().setStyle(inStyle),
            String.format("%.1f", time).literal().setStyle(inStyle)
        ).setStyle(outStyle), false
    )
}

fun PlayerEntity.sendTeleportTime(
    time: Double,
    outStyle: Style = TextColorPallet.primary,
    inStyle: Style = TextColorPallet.secondary
) {
    this.sendMessage(
        TeleportSpec.remain.getMutableText(
            String.format("%.1f", time).literal().setStyle(inStyle)
        ).setStyle(outStyle), false
    )
}


fun PlayerEntity.sendClickableTpaMessage(
    translateKey: RequiredItem<String>,
    player: PlayerEntity,
    command: String,
    outStyle: Style = TextColorPallet.primary,
    inStyle: Style = TextColorPallet.secondary
) {
    val message = translateKey.getMutableText(
        player.getColoredName(inStyle)
    )
    val clickEvent: net.minecraft.text.ClickEvent = net.minecraft.text.ClickEvent.RunCommand(command)
    val clickStyle = outStyle.withClickEvent(clickEvent)
    message.setStyle(clickStyle)
    this.sendMessage(message, false)
}

fun Double.translateSecondToTick(): Double = this * Config.getTickRate()

fun Double.translateTickToSecond(): Double = this / Config.getTickRate()
