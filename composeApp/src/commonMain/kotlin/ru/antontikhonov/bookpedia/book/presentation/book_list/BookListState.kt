package ru.antontikhonov.bookpedia.book.presentation.book_list

import ru.antontikhonov.bookpedia.book.domain.Book
import ru.antontikhonov.bookpedia.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResults: List<Book> = emptyList(),
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = true,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null,
)
