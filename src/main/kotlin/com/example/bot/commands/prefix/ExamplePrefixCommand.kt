package com.example.bot.commands.prefix

import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter

class ExamplePrefixCommand : ListenerAdapter() {
    override fun onMessageReceived(event: MessageReceivedEvent) {
        val message = event.message
        val content = message.contentRaw
        if (content.startsWith("!example")) {
            event.channel.sendMessage("example").queue()
        }
    }
}