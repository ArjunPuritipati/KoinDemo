package edu.uga.cs.koindemo.data.api

import edu.uga.cs.koindemo.data.model.User
import retrofit2.http.GET
import retrofit2.Response

interface UserApi {
    @GET("users")
    suspend fun getUsers(): Response<List<User>>
}