package com.axondragonscale.noteapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.axondragonscale.noteapp.ui.theme.*

/**
 * Created by Ronak Harkhani on 27/11/21
 */
@Entity
data class Note(
    @PrimaryKey val id: Int? = null,
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}
