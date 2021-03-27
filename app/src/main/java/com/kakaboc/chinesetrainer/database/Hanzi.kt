package com.kakaboc.chinesetrainer.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Hanzi(
        @PrimaryKey val id: Int,
        val character: Char,
        val pinyin: String,
)
