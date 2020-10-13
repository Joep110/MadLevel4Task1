package com.example.madlevel4task1

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName =  "Product_Table")
data class Product (

    @ColumnInfo(name = "name")
    var productName: String,

    @ColumnInfo(name = "quantity")
    var productQuantity: Short,

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null

)