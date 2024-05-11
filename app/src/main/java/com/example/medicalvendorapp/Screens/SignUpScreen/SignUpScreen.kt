package com.example.medicalvendorapp.Screens.SignUpScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PersonPinCircle
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.PinDrop
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.medicalvendorapp.R
import com.example.medicalvendorapp.ui.theme.AppColor
import com.example.medicalvendorapp.ui.theme.Color1

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen(navController: NavController) {
    val name = remember {
        mutableStateOf("")
    }
    val email = remember {
        mutableStateOf("")
    }
    val password = remember {
        mutableStateOf("")
    }
    val phoneNumber = remember {
        mutableStateOf("")
    }
    val pinCode = remember {
        mutableStateOf("")
    }
    val address = remember {
        mutableStateOf("")
    }



    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Column(
            modifier = Modifier
                .wrapContentSize()
                .clip(RoundedCornerShape(bottomEnd = 50.dp, bottomStart = 50.dp))
                .background(AppColor),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable._558301_4164000),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            )
            Text(
                text = "Welcome To Medical Vendor",
                fontStyle = FontStyle.Normal,
                fontSize = 20.sp,
                color = Color.Black,
                fontFamily = FontFamily(Font(R.font.poppins_light))
            )
            Text(
                text = "Sign Up",
                fontStyle = FontStyle.Normal,
                fontSize = 25.sp,
                color = Color.White,
                fontFamily = FontFamily(Font(R.font.poppins_bold))
            )
        }
        Spacer(modifier = Modifier.size(20.dp))
        Column(
            modifier = Modifier
                .fillMaxSize()
                .shadow(elevation = 10.dp)
                .clip(RoundedCornerShape(topEnd = 40.dp, topStart = 40.dp))
                .background(Color.White)
                .padding(vertical = 10.dp, horizontal = 20.dp)
        ) {

            OutlinedTextField(
                value = name.value,
                onValueChange = { name.value = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp),
                label = { Text(text = "Enter Your Name",fontFamily = FontFamily(Font(R.font.poppins_medium)),) },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "",
                        tint = AppColor,

                    )

                },
                colors = TextFieldDefaults.colors(
                    focusedLeadingIconColor = AppColor,
                    unfocusedLeadingIconColor = Color1,
                    focusedLabelColor = AppColor,
                    unfocusedLabelColor = Color.Black,
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedIndicatorColor = AppColor,
                    unfocusedIndicatorColor = Color.LightGray,
                    unfocusedPlaceholderColor = AppColor,
                    errorTextColor = Color.Red
                ),

                )

            OutlinedTextField(
                value = email.value,
                onValueChange = { email.value = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp),
                label = { Text(text = "Enter Email",fontFamily = FontFamily(Font(R.font.poppins_medium))) },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "",
                        tint = AppColor
                    )
                },
                colors = TextFieldDefaults.colors(
                    focusedLeadingIconColor = AppColor,
                    unfocusedLeadingIconColor = Color1,
                    focusedLabelColor = AppColor,
                    unfocusedLabelColor = Color.Black,
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedIndicatorColor = AppColor,
                    unfocusedIndicatorColor = Color.LightGray,
                    unfocusedPlaceholderColor = AppColor,
                    errorTextColor = Color.Red
                ),

                )

            OutlinedTextField(
                value = phoneNumber.value,
                onValueChange = { phoneNumber.value = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp),
                label = { Text(text = "Enter Phone number",fontFamily = FontFamily(Font(R.font.poppins_medium)),) },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Phone,
                        contentDescription = "",
                        tint = AppColor
                    )
                },
                colors = TextFieldDefaults.colors(
                    focusedLeadingIconColor = AppColor,
                    unfocusedLeadingIconColor = Color1,
                    focusedLabelColor = AppColor,
                    unfocusedLabelColor = Color.Black,
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedIndicatorColor = AppColor,
                    unfocusedIndicatorColor = Color.LightGray,
                    unfocusedPlaceholderColor = AppColor,
                    errorTextColor = Color.Red
                ),


                )

            OutlinedTextField(
                value = password.value,
                onValueChange = { password.value = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp),
                label = { Text(text = "Enter Password",fontFamily = FontFamily(Font(R.font.poppins_medium)),) },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "",
                        tint = AppColor
                    )
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                colors = TextFieldDefaults.colors(
                    focusedLeadingIconColor = AppColor,
                    unfocusedLeadingIconColor = Color1,
                    focusedLabelColor = AppColor,
                    unfocusedLabelColor = Color.Black,
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedIndicatorColor = AppColor,
                    unfocusedIndicatorColor = Color.LightGray,
                    unfocusedPlaceholderColor = AppColor,
                    errorTextColor = Color.Red
                ),

                )

            OutlinedTextField(
                value = pinCode.value,
                onValueChange = { pinCode.value = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp),
                label = { Text(text = "Enter Pincode",fontFamily = FontFamily(Font(R.font.poppins_medium)),) },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.PinDrop,
                        contentDescription = "",
                        tint = AppColor
                    )
                },
                colors = TextFieldDefaults.colors(
                    focusedLeadingIconColor = AppColor,
                    unfocusedLeadingIconColor = Color1,
                    focusedLabelColor = AppColor,
                    unfocusedLabelColor = Color.Black,
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedIndicatorColor = AppColor,
                    unfocusedIndicatorColor = Color.LightGray,
                    unfocusedPlaceholderColor = AppColor,
                    errorTextColor = Color.Red
                ),

                )

            OutlinedTextField(
                value = address.value,
                onValueChange = { address.value = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp),
                label = { Text(text = "Enter Address", modifier = Modifier
                    .wrapContentSize()
                    .align(Alignment.CenterHorizontally)
                ,fontFamily = FontFamily(Font(R.font.poppins_medium)),
                ) },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Home,
                        contentDescription = "",
                        tint = AppColor, modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                },
                minLines = 5,
                colors = TextFieldDefaults.colors(
                    focusedLeadingIconColor = AppColor,
                    unfocusedLeadingIconColor = Color1,
                    focusedLabelColor = AppColor,
                    unfocusedLabelColor = Color.Black,
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedIndicatorColor = AppColor,
                    unfocusedIndicatorColor = Color.LightGray,
                    unfocusedPlaceholderColor = AppColor,
                    errorTextColor = Color.Red
                ),
                )

            Button(
                onClick = {

                },
                shape = RoundedCornerShape(5.dp),
                contentPadding = PaddingValues(
                    start = 100.dp,
                    end = 100.dp,
                    top = 8.dp,
                    bottom = 8.dp
                ),
                colors = ButtonDefaults.buttonColors(
                    AppColor
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp)
                    .padding(bottom = 20.dp, top = 10.dp),
            ) {
                Text(
                    text = "Sign Up",
                    fontSize = 18.sp,
                    fontStyle = FontStyle.Normal,
                    fontFamily = FontFamily(Font(R.font.poppins_medium)),
                )
            }
        }
    }
}
