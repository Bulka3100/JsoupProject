package org.example.Json

import org.jsoup.Jsoup

fun main() {
    val doc = Jsoup.connect( "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/").get()

    val quotes = doc.select("div.sc-14uz67c-3.cOOA-do div.sc-2aegk7-2.bzpNIu")

    for (quote in quotes) {
        println("Цитата:")
        println(quote.text().trim())
    }
        //почему у меня так много цитат? Как выловить только те что на первой странице? (3 штуки) пытался искать  через общий контейнер для 3х цитат но не помогло doc.select("div.m4n24q-0.iHNDxGdiv div.sc-2aegk7-2.bzpNIu")
}