package ru.antontikhonov.bookpedia

import androidx.compose.ui.window.ComposeUIViewController
import ru.antontikhonov.bookpedia.app.App
import ru.antontikhonov.bookpedia.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) {
    App()
}
