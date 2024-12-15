package ru.antontikhonov.bookpedia

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import ru.antontikhonov.bookpedia.book.domain.Book
import ru.antontikhonov.bookpedia.book.presentation.book_list.BookListScreen
import ru.antontikhonov.bookpedia.book.presentation.book_list.BookListState
import ru.antontikhonov.bookpedia.book.presentation.book_list.components.BookSearchBar

@Preview
@Composable
private fun BookSearchBarPreview() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White),
    ) {
        BookSearchBar(
            searchQuery = "",
            onSearchQueryChange = {},
            onImeSearch = {},
            modifier = Modifier.fillMaxWidth(),
        )
    }
}

@Preview
@Composable
private fun BookListScreenPreview() {
    BookListScreen(
        state = BookListState(
            searchResults = books,
        ),
        onAction = {},
    )
}

private val books = (1..100).map {
    Book(
        id = it.toString(),
        title = "Book $it",
        imageUrl = "https://test.com",
        authors = listOf("J. K. Rowling"),
        description = "Description",
        languages = emptyList(),
        firstPublishYear = null,
        averageRating = 4.9894,
        ratingCount = 5,
        numPages = 456,
        numEditions = 3,
    )
}
