package ru.antontikhonov.bookpedia.book.presentation.book_detail

import ru.antontikhonov.bookpedia.book.domain.Book

data class BookDetailState(
    val isLoading: Boolean = true,
    val isFavorite: Boolean = false,
    val book: Book? = null
)
