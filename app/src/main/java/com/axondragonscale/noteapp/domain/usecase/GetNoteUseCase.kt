package com.axondragonscale.noteapp.domain.usecase

import com.axondragonscale.noteapp.domain.model.Note
import com.axondragonscale.noteapp.domain.repository.NoteRepository

/**
 * Created by Ronak Harkhani on 28/11/21
 */
class GetNoteUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}