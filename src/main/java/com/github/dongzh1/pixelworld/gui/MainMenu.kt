package com.github.dongzh1.pixelworld.gui

import com.github.dongzh1.pixelworld.nbt.CustomData
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.InventoryType
import org.bukkit.inventory.Inventory
import org.bukkit.inventory.ItemStack

class MainMenu {
    //展示给玩家看主菜单
    fun showInventory(player: Player){
        var mainMenu = Bukkit.createInventory(null,6*9,"§a§l世界列表")
        var itemHead = ItemStack(Material.PLAYER_HEAD)
        itemHead = CustomData().changeCustomData(itemHead)
        mainMenu.setItem(0,itemHead)
        player.openInventory(mainMenu)
    }

}