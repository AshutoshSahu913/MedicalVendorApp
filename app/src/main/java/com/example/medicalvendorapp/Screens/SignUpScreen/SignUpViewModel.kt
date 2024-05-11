package com.example.medicalvendorapp.Screens.SignUpScreen

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.medicalvendorapp.API.RetrofitInstance.api
import com.example.medicalvendorapp.DataModel.UserResponse
import kotlinx.coroutines.launch

class SignUpViewModel(application: Application) : AndroidViewModel(application) {


    suspend fun getAllUsers(): UserResponse {
        viewModelScope.launch {
            Log.d("GET_USER", "createUser: ${api.getAllUsers()[0]}")
        }
        return  api.getAllUsers()
    }
}