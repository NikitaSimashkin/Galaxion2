package ru.kram.galaxion2.ui.screens.menu

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

class MenuButtonsPreviewProvider : PreviewParameterProvider<String> {
    override val values: Sequence<String> = listOf("Play").asSequence()
}

class MenuDataProvider : PreviewParameterProvider<MainMenuData> {
    override val values: Sequence<MainMenuData> = sequenceOf(
        MainMenuData(
            "Play",
            "Shop",
            "Settings",
            {},
            {},
            {}
        )
    )
}