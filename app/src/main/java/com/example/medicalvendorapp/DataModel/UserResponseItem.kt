package com.example.medicalvendorapp.DataModel

data class UserResponseItem(
    val address: String,
    val approved: Int,
    val block: Int,
    val dateOfAccountCreation: String,
    val email: String,
    val id: Int,
    val level: Int,
    val name: String,
    val password: String,
    val phone: String,
    val pincode: String,
    val user_id: String
)