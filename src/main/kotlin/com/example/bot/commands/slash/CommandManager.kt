package com.example.bot.commands.slash

import net.dv8tion.jda.api.events.session.ReadyEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter
import net.dv8tion.jda.api.interactions.commands.build.CommandData
import net.dv8tion.jda.api.interactions.commands.build.Commands

class CommandManager : ListenerAdapter() {
    override fun onReady(event: ReadyEvent) {
        val commandData = mutableListOf<CommandData>()
        commandData.add(Commands.slash("example", "example"))
        event.jda.updateCommands().addCommands(commandData).queue()
    }
}