package com.letsmovie.ui.tv

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.size.Scale
import com.letsmovie.R
import com.letsmovie.model.Tv
import com.letsmovie.util.Define

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TvItem(
    tv: Tv,
    modifier: Modifier = Modifier,
    onTvClick: (tvId: String) -> Unit
) {
    Card(
        shape = RoundedCornerShape(10.dp),
        modifier = modifier,
        onClick = {
            onTvClick(tv.id)
        }
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(Define.BASE_IMG_URL + tv.imgPoster)
                .scale(Scale.FIT)
                .crossfade(true)
                .build(),
            contentDescription = null,
            placeholder = painterResource(id = R.drawable.loading_image),
            error = painterResource(id = R.drawable.no_image_available)
        )
    }
}