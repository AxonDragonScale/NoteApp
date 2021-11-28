package com.axondragonscale.noteapp.presentation.notes

import com.axondragonscale.noteapp.domain.model.Note
import com.axondragonscale.noteapp.domain.util.NoteOrder

/**
 * Created by Ronak Harkhani on 27/11/21
 */
sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}