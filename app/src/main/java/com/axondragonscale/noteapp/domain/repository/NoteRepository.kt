package com.axondragonscale.noteapp.domain.repository

import com.axondragonscale.noteapp.domain.model.Note
import kotlinx.coroutines.flow.Flow

/**
 * Created by Ronak Harkhani on 27/11/21
 */
interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}