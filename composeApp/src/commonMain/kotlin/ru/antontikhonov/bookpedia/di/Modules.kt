package ru.antontikhonov.bookpedia.di

import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module
import ru.antontikhonov.bookpedia.book.data.network.KtorRemoteBookDataSource
import ru.antontikhonov.bookpedia.book.data.network.RemoteBookDataSource
import ru.antontikhonov.bookpedia.book.domain.BookRepository
import ru.antontikhonov.bookpedia.core.data.HttpClientFactory
import ru.antontikhonov.bookpedia.book.data.repository.DefaultBookRepository
import ru.antontikhonov.bookpedia.book.presentation.book_list.BookListViewModel

expect val platformModule: Module

val sharedModule = module {
    single { HttpClientFactory.create(get()) }
    singleOf(::KtorRemoteBookDataSource).bind<RemoteBookDataSource>()
    singleOf(::DefaultBookRepository).bind<BookRepository>()

    viewModelOf(::BookListViewModel)
}
