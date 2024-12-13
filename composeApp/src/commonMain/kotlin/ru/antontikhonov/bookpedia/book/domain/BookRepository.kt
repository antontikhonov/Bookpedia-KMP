package ru.antontikhonov.bookpedia.book.domain

import ru.antontikhonov.bookpedia.core.DataError
import ru.antontikhonov.bookpedia.core.Result

interface BookRepository {

    suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote>
}