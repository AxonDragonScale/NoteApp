package com.axondragonscale.noteapp.presentation.notes

import com.axondragonscale.noteapp.domain.model.Note
import com.axondragonscale.noteapp.domain.util.NoteOrder
import com.axondragonscale.noteapp.domain.util.OrderType

/**
 * Created by Ronak Harkhani on 27/11/21
 */
data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val showOrderSection: Boolean = false
)