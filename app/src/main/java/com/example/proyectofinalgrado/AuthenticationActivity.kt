package com.example.proyectofinalgrado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import com.example.proyectofinalgrado.singin.SingInActivity

class AuthenticationActivity : AppCompatActivity() {

    private lateinit var Username :EditText
    private lateinit var Password :EditText
    private lateinit var btnLogin :Button
    private lateinit var btnForgotPassword :Button
    private lateinit var btnLoginGoogle :Button
    private lateinit var btnLoginFacebook :Button
    private lateinit var btnSingIn :Button

    private lateinit var username :String
    private lateinit var password :String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentication)

        Username = findViewById(R.id.editTextUsername)
        Password = findViewById(R.id.editTextPassword)
        btnLogin = findViewById(R.id.btnLogin)
        btnLoginGoogle = findViewById(R.id.btnLoginGoogle)
        btnLoginFacebook = findViewById(R.id.btnLoginFacebook)
        btnForgotPassword = findViewById(R.id.btnForgotPassword)
        btnSingIn = findViewById(R.id.btnSingIn)

        //ACTION BUTON LOGIN
        btnLogin.setOnClickListener {

            username = Username.text.toString()
            password = Password.text.toString()

            //CREAR FUNCION LOGIN--------------------------------------------------------------------------------------------------------------
        }

        //ACTION BUTTON FORGOT PASSWORD
        btnForgotPassword.setOnClickListener {
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }

        //ACTION BUTTON LOGIN GOOGLE
        btnLoginGoogle.setOnClickListener {
            // MARCO AÑADE FUNCION!!-----------------------------------------------------------------------------------------------------------
        }

        //ACTION BUTTON LOGIN FACEBOOK
        btnLoginFacebook.setOnClickListener {
            // MARCO AÑADE FUNCION!!------------------------------------------------------------------------------------------------------------
        }

        //ACTION BUTTON SING IN
        btnSingIn.setOnClickListener {
            val intent = Intent(this, SingInActivity::class.java)
            startActivity(intent)
        }
    }

    //LOG IN FUCTION
    private fun logInUser (email: String,password: String ){
        //CREAR FUNCION PARA LOGEARSE
    }

}