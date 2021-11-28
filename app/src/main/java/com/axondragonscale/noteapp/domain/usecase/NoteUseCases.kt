package com.axondragonscale.noteapp.domain.usecase

/**
 * Created by Ronak Harkhani on 27/11/21
 */
data class NoteUseCases(
    val getNotesUseCase: GetNotesUseCase,
    val deleteNoteUseCase: DeleteNoteUseCase,
    val addNoteUseCase: AddNoteUseCase,
    val getNote: GetNoteUseCase
)
