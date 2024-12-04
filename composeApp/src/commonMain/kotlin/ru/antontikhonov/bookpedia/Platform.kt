package ru.antontikhonov.bookpedia

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform