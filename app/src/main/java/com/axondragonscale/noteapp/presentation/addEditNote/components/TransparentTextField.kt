package com.axondragonscale.noteapp.presentation.addEditNote.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusState
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

/**
 * Created by Ronak Harkhani on 29/11/21
 */

@Composable
fun TransparentTextField(
    text: String,
    hint: String,
    showHint: Boolean = true,
    singleLine: Boolean = false,
    textStyle: TextStyle = TextStyle(),
    modifier: Modifier = Modifier,
    onValueChange: (String) -> Unit,
    onFocusChange: (FocusState) -> Unit
) {
    Box(modifier = modifier) {
        BasicTextField(
            value = text,
            onValueChange = onValueChange,
            singleLine = singleLine,
            textStyle = textStyle,
            modifier = Modifier
                .fillMaxWidth()
                .onFocusChanged { onFocusChange(it) }
        )

        if (showHint) {
            Text(text = hint, style = textStyle, color = Color.DarkGray)
        }
    }
}