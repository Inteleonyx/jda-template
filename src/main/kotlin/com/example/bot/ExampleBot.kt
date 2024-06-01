package com.example.bot

import com.example.bot.commands.prefix.ExamplePrefixCommand
import com.example.bot.commands.slash.CommandManager
import com.example.bot.commands.slash.ExampleCommand
import io.github.cdimascio.dotenv.Dotenv
import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.OnlineStatus
import net.dv8tion.jda.api.entities.Activity
import net.dv8tion.jda.api.requests.GatewayIntent

class ExampleBot {
    companion object {

    private val dotenv = Dotenv.load()
    private val token = dotenv.get("token")

    private val jda = JDABuilder.createDefault(token)
        .enableIntents(
            GatewayIntent.GUILD_MESSAGES,
            GatewayIntent.GUILD_MEMBERS,
            GatewayIntent.GUILD_PRESENCES,
            GatewayIntent.MESSAGE_CONTENT
        ) //Bot's intents
        .addEventListeners(ExampleCommand(), ExamplePrefixCommand(), CommandManager()) //Add the listeners of your bot
        .setStatus(OnlineStatus.ONLINE) //You can change to IDLE, OFFLINE, DO_NOT_DISTURB and ONLINE
        .setActivity(Activity.watching("Example Bot"))
        .build()

        @JvmStatic
        fun main(args: Array<String>) {
            jda.run {  }
        }
    }
}