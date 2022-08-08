package com.wahyupurnomo.githubsearchuser.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.wahyupurnomo.githubsearchuser.api.RetrofitClient
import com.wahyupurnomo.githubsearchuser.data.model.User
import com.wahyupurnomo.githubsearchuser.data.model.userResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserViewModel: ViewModel() {
    val listUsers = MutableLiveData<ArrayList<User>>()

    fun setSearchUsers(query: String) {
        RetrofitClient.apiInstance
            .getSearchUsers(query)
            .enqueue(object : Callback<userResponse>{
                override fun onResponse(
                    call: Call<userResponse>,
                    response: Response<userResponse>
                ) {
                    if (response.isSuccessful) {
                        listUsers.postValue(response.body()?.items)
                    }
                }

                override fun onFailure(call: Call<userResponse>, t: Throwable) {
                    t.message?.let { Log.d("Error", it) }
                }
            })
    }

    fun getSearchUsers(): LiveData<ArrayList<User>> {
        return listUsers
    }
}