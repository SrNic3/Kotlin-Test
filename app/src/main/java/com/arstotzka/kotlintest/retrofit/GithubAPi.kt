package com.arstotzka.kotlintest.retrofit

import com.arstotzka.kotlintest.model.UserRepositoriesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Dani on 04/05/2017.
 */

interface GithubAPi {

    @GET("/users/:username/repos")
    fun listUserRepos(@Query("type") type: String,
                      @Query("sort") sort: String,
                      @Query("direction") direction: String)
            : Call<UserRepositoriesResponse>

}
