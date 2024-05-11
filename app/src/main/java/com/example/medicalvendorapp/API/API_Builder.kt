package com.example.medicalvendorapp.API

import com.example.medicalvendorapp.DataModel.CreateUserResponse
import com.example.medicalvendorapp.DataModel.UserResponse
import retrofit2.http.GET
import retrofit2.http.POST

interface API_Builder {
    //create user

    @POST("/createUser")
    suspend fun createUser(): CreateUserResponse

    @GET("/getAllUsers")
    suspend fun getAllUsers(): UserResponse

    companion object{
//        const val BASE_URL="http://127.0.0.1:5000"
        const val BASE_URL="https://ashutoshsahu09.pythonanywhere.com"
    }
}