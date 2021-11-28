package com.axondragonscale.noteapp.domain.usecase

import com.axondragonscale.noteapp.domain.model.InvalidNoteException
import com.axondragonscale.noteapp.domain.model.Note
import com.axondragonscale.noteapp.domain.repository.NoteRepository
import kotlin.jvm.Throws

/**
 * Created by Ronak Harkhani on 27/11/21
 */
class AddNoteUseCase(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) throw InvalidNoteException("Note's title cannot be blank.")
        if (note.content.isBlank()) throw InvalidNoteException("Note's content cannot be blank.")
        repository.insertNote(note)
    }
}