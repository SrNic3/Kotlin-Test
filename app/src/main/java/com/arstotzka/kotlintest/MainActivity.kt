package com.arstotzka.kotlintest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.arstotzka.kotlintest.retrofit.GithubAPi
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class MainActivity : AppCompatActivity() {

    private val githubApi: GithubAPi

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .addConverterFactory(MoshiConverterFactory.create())
                .build()

        githubApi = retrofit.create(GithubAPi::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        githubApi.listUserRepos("all","created","asc")
        
    }

}
