package com.axondragonscale.noteapp.domain.usecase

import com.axondragonscale.noteapp.domain.model.Note
import com.axondragonscale.noteapp.domain.repository.NoteRepository

/**
 * Created by Ronak Harkhani on 27/11/21
 */
class DeleteNoteUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}