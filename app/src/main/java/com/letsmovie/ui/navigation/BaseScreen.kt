package com.letsmovie.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector
import com.letsmovie.util.Define

sealed class BaseScreen(val route: String, val name: String, val icon: ImageVector){
    object MovieScreen: BaseScreen(Define.MOVIE_ROUTE, Define.MOVIE_NAME, Icons.Default.Home)
    object FavouriteScreen: BaseScreen(Define.FAVOURITE_ROUTE, Define.FAVOURITE_NAME, Icons.Default.Favorite)
    object TvScreen: BaseScreen(Define.TV_ROUTE, Define.TV_NAME, Icons.Default.ThumbUp)
    object SettingScreen: BaseScreen(Define.SETTING_ROUTE, Define.SETTING_NAME, Icons.Default.AccountCircle)
    object MovieDetailScreen: BaseScreen(Define.MOVIE_DETAIL_ROUTE, Define.MOVIE_DETAIL_NAME, Icons.Default.Home)
}
