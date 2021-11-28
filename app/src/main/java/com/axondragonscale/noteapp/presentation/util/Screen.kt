package com.axondragonscale.noteapp.presentation.util

/**
 * Created by Ronak Harkhani on 29/11/21
 */
sealed class Screen(val route: String) {
    object NotesScreen: Screen("NotesScreen")
    object AddEditNoteScreen: Screen("AddEditNoteScreen")
}