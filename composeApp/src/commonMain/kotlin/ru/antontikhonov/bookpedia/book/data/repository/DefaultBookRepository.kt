package ru.antontikhonov.bookpedia.book.data.repository

import ru.antontikhonov.bookpedia.book.data.mappers.toBook
import ru.antontikhonov.bookpedia.book.data.network.RemoteBookDataSource
import ru.antontikhonov.bookpedia.book.domain.Book
import ru.antontikhonov.bookpedia.book.domain.BookRepository
import ru.antontikhonov.bookpedia.core.DataError
import ru.antontikhonov.bookpedia.core.Result
import ru.antontikhonov.bookpedia.core.map

class DefaultBookRepository(
    private val remoteBookDataSource: RemoteBookDataSource,
) : BookRepository {

    override suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote> {
        return remoteBookDataSource
            .searchBooks(query)
            .map { dto ->
                dto.results.map { it.toBook() }
            }
    }
}
