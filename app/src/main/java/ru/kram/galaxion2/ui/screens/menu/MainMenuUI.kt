package ru.kram.galaxion2.ui.screens.menu

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.kram.galaxion2.ui.theme.*

@Composable
@Preview(device = Devices.AUTOMOTIVE_1024p, widthDp = 720, heightDp = 360)
fun MainActivityUI(
    @PreviewParameter(MenuDataProvider::class) data: MainMenuData
) {
    Galaxion_2Theme() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(3f)
                    .padding(bottom = 10.dp)
                    .background(Color.Green)
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(5f)
                    .padding(bottom = 10.dp),
                contentAlignment = Alignment.Center
            ) {
                Box(modifier = Modifier.fillMaxWidth(0.33f)) {
                    MainMenuButtons(
                        data = data
                    )
                }
            }

            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(2f)
            )
        }
    }
}

@Composable
private fun MainMenuButtons(
    data: MainMenuData
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        MainMenuButton(text = data.textButtonPlay, onClick = data.onClickPlay)
        MainMenuButton(text = data.textButtonShop, onClick = data.onClickShop)
        MainMenuButton(text = data.textButtonSettings, onClick = data.onClickSettings)
    }
}

@Preview(name = "MainMenuButton")
@Composable
private fun ColumnScope.MainMenuButton(
    @PreviewParameter(MenuButtonsPreviewProvider::class) text: String,
    onClick: () -> Unit = {}
) {
    Button(
        onClick = onClick,
        contentPadding = PaddingValues(0.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = PurpleMainMenuButtonBackground,
            contentColor = Color.White
        ),
        modifier = Modifier
            .clip(CircleMediumShape)
            .border(
                width = 2.dp,
                color = PurpleMainMenuButtonBorder,
                shape = CircleMediumShape
            )
            .weight(1f)
            .fillMaxSize()
    ) {
        Text(text = text, fontSize = 20.sp)
    }
}
