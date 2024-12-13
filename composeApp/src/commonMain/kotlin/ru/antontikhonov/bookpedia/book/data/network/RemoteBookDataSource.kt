package ru.antontikhonov.bookpedia.book.data.network

import ru.antontikhonov.bookpedia.book.data.dto.SearchResponseDto
import ru.antontikhonov.bookpedia.core.DataError
import ru.antontikhonov.bookpedia.core.Result

interface RemoteBookDataSource {

    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null,
    ): Result<SearchResponseDto, DataError.Remote>
}
