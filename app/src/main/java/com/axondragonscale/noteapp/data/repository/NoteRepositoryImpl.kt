package com.axondragonscale.noteapp.data.repository

import com.axondragonscale.noteapp.data.source.NoteDao
import com.axondragonscale.noteapp.domain.model.Note
import com.axondragonscale.noteapp.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

/**
 * Created by Ronak Harkhani on 27/11/21
 */
class NoteRepositoryImpl(
    private val noteDao: NoteDao
): NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return noteDao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return noteDao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        noteDao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        noteDao.deleteNote(note)
    }
}