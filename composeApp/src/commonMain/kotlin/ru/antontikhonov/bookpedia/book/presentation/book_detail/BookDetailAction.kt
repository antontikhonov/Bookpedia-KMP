package ru.antontikhonov.bookpedia.book.presentation.book_detail

import ru.antontikhonov.bookpedia.book.domain.Book

sealed interface BookDetailAction {

    data object OnBackClick : BookDetailAction

    data object OnFavoriteClick: BookDetailAction

    data class OnSelectedBookChange(val book: Book): BookDetailAction
}
