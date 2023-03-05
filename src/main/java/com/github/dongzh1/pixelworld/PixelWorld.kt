package com.github.dongzh1.pixelworld

import com.comphenix.protocol.ProtocolLibrary
import com.comphenix.protocol.ProtocolManager
import com.github.dongzh1.pixelworld.commands.Commands
import org.bukkit.Bukkit
import org.bukkit.configuration.file.FileConfiguration
import org.bukkit.configuration.file.YamlConfiguration
import org.bukkit.plugin.Plugin
import org.bukkit.plugin.java.JavaPlugin

class PixelWorld : JavaPlugin() {
    companion object PixelWorld {
        val instance = com.github.dongzh1.pixelworld.PixelWorld.create()
    }
    override fun onEnable() {
        getCommand("pixelworld")?.setExecutor(Commands())
        Bukkit.getConsoleSender().sendMessage("§a[§l像素世界§a]已加载成功")
        config = this.getConfig()
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}