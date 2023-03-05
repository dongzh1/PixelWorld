package com.github.dongzh1.pixelworld.nbt

import de.tr7zw.changeme.nbtapi.NBT
import org.bukkit.inventory.ItemStack

class CustomData {
    //改变模型
    fun changeCustomData(itemStack: ItemStack): ItemStack {
        var itemMeta = itemStack.itemMeta
        itemMeta.setCustomModelData(10010)
        itemStack.setItemMeta(itemMeta)
        return itemStack
    }
}