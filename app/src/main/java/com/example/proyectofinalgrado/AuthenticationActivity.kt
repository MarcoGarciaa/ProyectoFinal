package com.example.proyectofinalgrado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

class AuthenticationActivity : AppCompatActivity() {

    private lateinit var btnGoBack :ImageButton
    private lateinit var Username :EditText
    private lateinit var Password :EditText
    private lateinit var btnLogin :Button
    private lateinit var btnForgotPassword :Button

    private lateinit var username :String
    private lateinit var password :String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentication)

        btnGoBack = findViewById(R.id.imageBtnGoBack)
        Username = findViewById(R.id.editTextUsername)
        Password = findViewById(R.id.editTextPassword)
        btnLogin = findViewById(R.id.btnLogin)
        btnForgotPassword = findViewById(R.id.btnForgotPassword)


        //GO BACK BUTTON
        btnGoBack.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        //ACTION BUTON LOGIN
        btnLogin.setOnClickListener {

            username = Username.text.toString()
            password = Password.text.toString()

            logInUser(username,password)

            //val intent = Intent(this, HomeActivity::class.java)
            //startActivity(intent)
        }

        //ACTION BUTTON FORGOT PASSWORD
        btnForgotPassword.setOnClickListener {
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }

    }

    //LOG IN FUCTION
    private fun logInUser (username: String,password: String ){
        //CREAR FUNCION LOGIN--------------------------------------------------------------------------------------------------------------
    }

}