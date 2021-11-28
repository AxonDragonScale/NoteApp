package com.axondragonscale.noteapp.domain.usecase

import com.axondragonscale.noteapp.domain.model.Note
import com.axondragonscale.noteapp.domain.repository.NoteRepository
import com.axondragonscale.noteapp.domain.util.NoteOrder
import com.axondragonscale.noteapp.domain.util.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

/**
 * Created by Ronak Harkhani on 27/11/21
 */
class GetNotesUseCase(
    private val repository: NoteRepository
) {
    operator fun invoke(
        noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending)
    ): Flow<List<Note>> {
        return repository.getNotes().map {
            when (noteOrder.orderType) {
                is OrderType.Ascending -> {
                    when (noteOrder) {
                        is NoteOrder.Date -> it.sortedBy { it.timestamp }
                        is NoteOrder.Title -> it.sortedBy { it.title.lowercase() }
                        is NoteOrder.Color -> it.sortedBy { it.color }
                    }
                }

                is OrderType.Descending -> {
                    when (noteOrder) {
                        is NoteOrder.Date -> it.sortedByDescending { it.timestamp }
                        is NoteOrder.Title -> it.sortedByDescending { it.title.lowercase() }
                        is NoteOrder.Color -> it.sortedByDescending { it.color }
                    }
                }
            }
        }
    }
}