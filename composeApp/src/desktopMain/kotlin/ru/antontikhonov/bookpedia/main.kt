package ru.antontikhonov.bookpedia

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import ru.antontikhonov.bookpedia.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "Bookpedia-KMP",
        ) {
            App()
        }
    }
}
