package com.wahyupurnomo.githubsearchuser.api

import com.wahyupurnomo.githubsearchuser.data.model.DetaiUserResponse
import com.wahyupurnomo.githubsearchuser.data.model.User
import com.wahyupurnomo.githubsearchuser.data.model.userResponse
import retrofit2.Call
import retrofit2.http.*

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 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")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<userResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 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")
    fun getUserDetail(
        @Path("username") usename: String?
    ): Call<DetaiUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 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")
    fun getFollowers(
        @Path("username") usename: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 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")
    fun getFollowing(
        @Path("username") usename: String
    ): Call<ArrayList<User>>
}