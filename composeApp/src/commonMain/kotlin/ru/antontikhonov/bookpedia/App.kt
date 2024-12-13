package ru.antontikhonov.bookpedia

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import io.ktor.client.engine.HttpClientEngine
import org.jetbrains.compose.ui.tooling.preview.Preview
import ru.antontikhonov.bookpedia.book.data.network.KtorRemoteBookDataSource
import ru.antontikhonov.bookpedia.book.data.repository.DefaultBookRepository
import ru.antontikhonov.bookpedia.book.presentation.book_list.BookListScreenRoot
import ru.antontikhonov.bookpedia.book.presentation.book_list.BookListViewModel
import ru.antontikhonov.bookpedia.core.data.HttpClientFactory

@Composable
@Preview
fun App(engine: HttpClientEngine) {
    BookListScreenRoot(
        viewModel = remember {
            BookListViewModel(
                bookRepository = DefaultBookRepository(
                    remoteBookDataSource = KtorRemoteBookDataSource(
                        httpClient = HttpClientFactory.create(engine)
                    )
                )
            )
        },
        onBookClick = {

        }
    )
}
