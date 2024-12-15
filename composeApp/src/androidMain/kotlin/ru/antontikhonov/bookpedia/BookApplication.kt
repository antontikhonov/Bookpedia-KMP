package ru.antontikhonov.bookpedia

import android.app.Application
import org.koin.android.ext.koin.androidContext
import ru.antontikhonov.bookpedia.di.initKoin

class BookApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@BookApplication)
        }
    }
}
