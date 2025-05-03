package com.example.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title: String = "",
    @ColumnInfo(name = "wish-desc")
    val description: String = ""
)

object DummyWish {
    val wishList = listOf(
        Wish(title = "Google Watch 2", description = "An Android Watch"),
        Wish(title = "Oculus Quest 2", description = "A VR Headset for Playing Games"),
        Wish(title = "A Sci-fi Book", description = "A Science Fiction Book from any best seller"),
        Wish(title = "Bean Bag", description = "A Comfy Bean Bag to substitute for a chair"),
    )
}