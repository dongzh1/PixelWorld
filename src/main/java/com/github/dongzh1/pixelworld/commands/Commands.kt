package com.github.dongzh1.pixelworld.commands

import com.github.dongzh1.pixelworld.gui.MainMenu
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.eclipse.sisu.launch.Main

class Commands:CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String,
                           args: Array<out String>): Boolean {
        if (sender is Player){
            if (args.size == 2){
                when(args[0]){
                    "open" -> {
                        when(args[1]){
                            "main" -> {
                                sender
                                //显示世界列表gui给玩家，返回true
                                MainMenu().showInventory(sender)
                                return true
                            }
                        }
                    }
                    else -> {
                        sender.sendMessage("指令打错了哟！！！应该是关键字不对")
                        return true
                    }
                }
            }
            sender.sendMessage("指令输入错误，应该是长度不对")
            return true
        }
        sender.sendMessage("请由玩家执行命令，控制台打咩")
        return true
    }
}