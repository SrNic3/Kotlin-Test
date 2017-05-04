package com.arstotzka.kotlintest.model

/**
 * Created by Dani on 04/05/2017.
 */


class UserRepositoriesResponse(val data: List<Repository>)

class Repository(
        val id: String,
        val name: String,
        val html_url: String,
        val full_name: String)