package com.axondragonscale.noteapp.presentation.addEditNote

/**
 * Created by Ronak Harkhani on 28/11/21
 */
data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val showHint: Boolean = true
)
