package io.github.sinhajun.command

import io.github.monun.kommand.kommand
import org.bukkit.entity.Player
import org.bukkit.plugin.java.JavaPlugin

object Command {
    fun register(plugin: JavaPlugin) {
        plugin.kommand {
            register("fiano", "piano") {
                requires { isPlayer }
                then("open") {
                    executes {
                        val player = sender as Player
                        player.sendMessage("test success")
                    }
                }
            }
        }
    }
}