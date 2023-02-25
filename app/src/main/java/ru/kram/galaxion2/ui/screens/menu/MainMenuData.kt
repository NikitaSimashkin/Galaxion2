package ru.kram.galaxion2.ui.screens.menu

class MainMenuData(
    val textButtonPlay: String,
    val textButtonShop: String,
    val textButtonSettings: String,
    val onClickPlay: () -> Unit,
    val onClickShop: () -> Unit,
    val onClickSettings: () -> Unit,
)