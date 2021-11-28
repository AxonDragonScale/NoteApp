package com.axondragonscale.noteapp.data.source

import androidx.room.*
import com.axondragonscale.noteapp.domain.model.Note
import kotlinx.coroutines.flow.Flow

/**
 * Created by Ronak Harkhani on 27/11/21
 */
@Dao
interface NoteDao {

    @Query("SELECT * FROM note")
    fun getNotes(): Flow<List<Note>>

    @Query("SELECT * FROM note WHERE id = :id")
    suspend fun getNoteById(id: Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)
}