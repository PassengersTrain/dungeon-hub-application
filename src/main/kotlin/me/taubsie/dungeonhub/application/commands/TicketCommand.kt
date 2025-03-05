package me.taubsie.dungeonhub.application.commands

import dev.kordex.core.extensions.Extension
import dev.kordex.core.extensions.publicSlashCommand
import dev.kordex.core.i18n.toKey

class TicketCommand : Extension() {
    override val name = "ticket-command"

    override suspend fun setup() {
        publicSlashCommand {
            name = "ticket".toKey()
            description = "Manages tickets.".toKey()
            allowInDms = false


        }
    }
}