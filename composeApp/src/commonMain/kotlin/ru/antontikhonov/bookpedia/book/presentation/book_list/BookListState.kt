package ru.antontikhonov.bookpedia.book.presentation.book_list

import ru.antontikhonov.bookpedia.book.domain.Book
import ru.antontikhonov.bookpedia.presentation.UiText

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResults: List<Book> = books,
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null,
)

val books = (1..100).map {
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
