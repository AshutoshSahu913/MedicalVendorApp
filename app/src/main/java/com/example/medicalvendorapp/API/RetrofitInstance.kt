package com.example.medicalvendorapp.API

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// Singleton object for creating Retrofit instances
object RetrofitInstance {

    // OkHttpClient instance for handling HTTP requests
    private val client: OkHttpClient = OkHttpClient.Builder().build()

    // Retrofit instance for building and executing HTTP requests
    val api = Retrofit.Builder()
        .client(client) // Set the OkHttpClient for this Retrofit instance
        .baseUrl(API_Builder.BASE_URL) // Set the base URL for the API endpoints
        .addConverterFactory(GsonConverterFactory.create()) // Add Gson converter for JSON parsing
        .build() // Build the Retrofit instance
        .create(API_Builder::class.java)

}
