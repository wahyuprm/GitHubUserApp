package com.wahyupurnomo.githubsearchuser.data.model


data class DetaiUserResponse(
    val login: String,
    val id: Int,
    val avatar_url: String,
    val followers_url: String,
    val following_url: String,
    val name: String,
    val following: Int,
    val followers: Int,
    val company: String,
    val location: String,
    val blog: String
)
