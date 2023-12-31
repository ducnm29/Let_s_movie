package com.letsmovie.ui.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.letsmovie.R

@Composable
fun SearchBarUI(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = dimensionResource(id = R.dimen.spacer_horizontal2),
                end = dimensionResource(id = R.dimen.spacer_horizontal2)
            )
            .clip(RoundedCornerShape(16.dp))
            .clickable(onClick = onClick)
    ) {
        TextField(
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            ),
            value = "",
            onValueChange = {},
            modifier = modifier
                .height(48.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = null
                )
            },
            placeholder = {
                Text(
                    text = stringResource(id = R.string.search_title),
                    fontSize = dimensionResource(id = R.dimen.sub_item_title).value.sp
                )
            },
            enabled = false
        )
    }
}