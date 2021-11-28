package com.axondragonscale.noteapp.presentation.addEditNote

import androidx.compose.ui.focus.FocusState
import androidx.compose.ui.graphics.Color

/**
 * Created by Ronak Harkhani on 29/11/21
 */
sealed class AddEditNoteEvent {
    data class ChangeTitleFocus(val focusState: FocusState): AddEditNoteEvent()
    data class EnteredTitle(val value: String): AddEditNoteEvent()
    data class ChangeContentFocus(val focusState: FocusState): AddEditNoteEvent()
    data class EnteredContent(val value: String): AddEditNoteEvent()
    data class ChangeColor(val color: Color): AddEditNoteEvent()
    object SaveNote: AddEditNoteEvent()
}