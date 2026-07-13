package net.superricky.tpaplusplus.command.subcommands

import net.minecraft.server.command.CommandManager.literal
import net.minecraft.text.ClickEvent
import net.superricky.tpaplusplus.GlobalConst
import net.superricky.tpaplusplus.TpaPlusPlus
import net.superricky.tpaplusplus.command.BuildableCommand
import net.superricky.tpaplusplus.config.language.LanguageConfig.getMutableText
import net.superricky.tpaplusplus.config.language.SystemSpec
import net.superricky.tpaplusplus.utility.Context
import net.superricky.tpaplusplus.utility.LiteralNode
import net.superricky.tpaplusplus.utility.TextColorPallet
import net.superricky.tpaplusplus.utility.literal
import java.net.URI

object RootCommand : BuildableCommand {
    override fun build(): LiteralNode =
        literal(GlobalConst.MOD_ID)
            .then(
                literal("version").executes { showMetaData(it) }
            )
            .executes { showMetaData(it) }
            .build()

    @Suppress("LongMethod")
    private fun showMetaData(context: Context): Int {
        val source = context.source
        source.sendFeedback(
            {
                SystemSpec.version.getMutableText(
                    TpaPlusPlus.version.literal().setStyle(TextColorPallet.secondaryVariant)
                ).setStyle(TextColorPallet.primaryVariant)
            },
            false
        )
        source.sendFeedback(
            {
                SystemSpec.githubBase.getMutableText(
                    SystemSpec.githubView.getMutableText()
                        .setStyle(TextColorPallet.secondaryVariant)
                        .styled { it.withClickEvent(ClickEvent.OpenUrl(URI.create(GlobalConst.GITHUB_URL))) }
                ).setStyle(TextColorPallet.primaryVariant)
            },
            false
        )
        source.sendFeedback(
            {
                SystemSpec.modrinthBase.getMutableText(
                    SystemSpec.modrinthView.getMutableText()
                        .setStyle(TextColorPallet.secondaryVariant)
                        .styled { it.withClickEvent(ClickEvent.OpenUrl(URI.create(GlobalConst.MODRINTH_URL))) }
                ).setStyle(TextColorPallet.primaryVariant)
            },
            false
        )
        source.sendFeedback(
            {
                SystemSpec.curseforgeBase.getMutableText(
                    SystemSpec.curseforgeView.getMutableText()
                        .setStyle(TextColorPallet.secondaryVariant)
                        .styled { it.withClickEvent(ClickEvent.OpenUrl(URI.create(GlobalConst.CURSEFORGE_URL))) }
                ).setStyle(TextColorPallet.primaryVariant)
            },
            false
        )
        return 1
    }
}
