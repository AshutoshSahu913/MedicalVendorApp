package com.example.medicalvendorapp.Screens.LoginScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material.icons.outlined.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.medicalvendorapp.DestinationScreen
import com.example.medicalvendorapp.R
import com.example.medicalvendorapp.ui.theme.AppColor
import com.example.medicalvendorapp.ui.theme.Color1
import com.example.medicalvendorapp.ui.theme.Color2

@Composable
fun LoginScreen(navController: NavController) {

    val email = remember {
        mutableStateOf("")
    }
    val password = remember {
        mutableStateOf("")
    }
    var passwordVisibility by remember { mutableStateOf(false) }

    Scaffold(content = {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color2)
                .padding(it)
                .verticalScroll(rememberScrollState())
        ) {
            Column(
                modifier = Modifier
                    .wrapContentSize()
                    .clip(RoundedCornerShape(bottomEnd = 50.dp, bottomStart = 50.dp))
                    .background(Color.White)
                    .alpha(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.computer_login_pana__1_),
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                )
                Text(
                    text = "Welcome To Medical Vendor App",
                    fontStyle = FontStyle.Normal,
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontFamily = FontFamily(Font(R.font.poppins_light))
                )
                Text(
                    text = "Login Screen",
                    fontStyle = FontStyle.Normal,
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontFamily = FontFamily(Font(R.font.poppins_medium))
                )
            }
            Spacer(modifier = Modifier.size(20.dp))
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(5.dp)
                    .clip(
                        RoundedCornerShape(
                            topEnd = 40.dp,
                            topStart = 40.dp,
                            bottomEnd = 40.dp,
                            bottomStart = 40.dp
                        )
                    )
                    .background(Color.White)
                    .wrapContentHeight()
                    .padding(vertical = 10.dp, horizontal = 20.dp)
            ) {
                OutlinedTextField(
                    value = email.value,
                    onValueChange = { email.value = it },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp),
                    label = {
                        Text(
                            text = "Enter Email",
                            fontFamily = FontFamily(Font(R.font.poppins_medium))
                        )
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = "",
                            tint = AppColor
                        )
                    },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
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
                    textStyle = TextStyle(
                        fontFamily = FontFamily(Font(R.font.poppins_medium))
                    ),
                )


                OutlinedTextField(
                    value = password.value,
                    onValueChange = { password.value = it },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp),
                    label = {
                        Text(
                            text = "Enter Password",
                            fontFamily = FontFamily(Font(R.font.poppins_medium))
                        )
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = "",
                            tint = AppColor
                        )
                    },
                    trailingIcon = {
                        val icon =
                            if (passwordVisibility) Icons.Outlined.Visibility else Icons.Outlined.VisibilityOff
                        val tint = if (passwordVisibility) AppColor else Color.Gray
                        Icon(
                            imageVector = icon,
                            contentDescription = "Toggle Password Visibility",
                            tint = tint,
                            modifier = Modifier.clickable {
                                passwordVisibility = !passwordVisibility
                            }
                        )
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Password,
                    ),
                    visualTransformation = if (passwordVisibility) VisualTransformation.None else PasswordVisualTransformation(),
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
                    textStyle = TextStyle(
                        fontFamily = FontFamily(Font(R.font.poppins_medium))
                    )

                )
                Text(
                    text = "Forget Password ?",
                    fontSize = 12.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily(Font(R.font.poppins_bold)),
                    style = TextStyle(textDecoration = TextDecoration.Underline),
                    color = Color.Black, modifier = Modifier
                        .align(Alignment.End)
                        .padding(10.dp)
                        .clickable {
                            navController.navigate(DestinationScreen.Forget.route)
                        }
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
                        .padding(bottom = 10.dp, top = 10.dp),
                ) {
                    Text(
                        text = "Login",
                        fontSize = 18.sp,
                        fontStyle = FontStyle.Normal,
                        fontFamily = FontFamily(Font(R.font.poppins_medium)),
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            bottom = 20.dp
                        ),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "New User ? ",
                        fontSize = 12.sp,
                        fontStyle = FontStyle.Normal,
                        fontFamily = FontFamily(Font(R.font.poppins_light)),
                        color = Color.Black,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                    Text(
                        text = "Register",
                        fontSize = 12.sp,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily(Font(R.font.poppins_bold)),
                        style = TextStyle(textDecoration = TextDecoration.Underline),
                        color = AppColor, modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .clickable {
                                navController.navigate(DestinationScreen.SignUp.route)
                            }
                    )
                }
            }
        }
    }
    )
}
