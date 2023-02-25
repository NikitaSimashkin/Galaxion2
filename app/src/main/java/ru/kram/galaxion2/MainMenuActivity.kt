package ru.kram.galaxion2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import ru.kram.galaxion2.ui.screens.menu.MainActivityUI
import ru.kram.galaxion2.ui.screens.menu.MainMenuData
import ru.kram.galaxion2.ui.screens.menu.MenuDataProvider
import ru.kram.galaxion2.ui.theme.Galaxion_2Theme

class MainMenuActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainActivityUI(MenuDataProvider().values.first())
        }
    }
}
