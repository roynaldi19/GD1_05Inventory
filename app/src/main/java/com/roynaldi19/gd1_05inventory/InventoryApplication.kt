package com.roynaldi19.gd1_05inventory

import android.app.Application
import com.roynaldi19.gd1_05inventory.data.ItemRoomDatabase

class InventoryApplication : Application(){
    val database: ItemRoomDatabase by lazy { ItemRoomDatabase.getDatabase(this) }
}
