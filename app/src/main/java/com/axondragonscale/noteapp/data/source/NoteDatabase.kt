package com.axondragonscale.noteapp.data.source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.axondragonscale.noteapp.domain.model.Note

/**
 * Created by Ronak Harkhani on 27/11/21
 */
@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {
    companion object {
        const val NOTE_DATABASE = "notes_db"
    }

    abstract val noteDao: NoteDao
}