package com.example.proyectofinalgrado


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.proyectofinalgrado.singin.SingInStep1Activity

class LoginActivity : AppCompatActivity() {

    private lateinit var btnLoginGoogle: Button
    private lateinit var btnLoginFacebook: Button
    private lateinit var btnLoginManual: Button
    private lateinit var btnSingInManual: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLoginGoogle = findViewById(R.id.btnLoginGoogle)
        btnLoginFacebook = findViewById(R.id.btnLoginFacebook)
        btnLoginManual = findViewById(R.id.btnLoginManual)
        btnSingInManual = findViewById(R.id.btnSingInManual)


        //LOGIN GOOGLE
        btnLoginGoogle.setOnClickListener {
            // MARCO AÑADE FUNCION!!------------------------------------------------------------------------------------------------------------
        }
        //LOGIN FACEBOOK
        btnLoginFacebook.setOnClickListener {
            // MARCO AÑADE FUNCION!!------------------------------------------------------------------------------------------------------------
        }
        //LOGIN MANUAL
        btnLoginManual.setOnClickListener {
            val intent = Intent(this, AuthenticationActivity::class.java)
            startActivity(intent)
        }
        //SING IN MANUAL
        btnSingInManual.setOnClickListener {
            val intent = Intent(this, SingInStep1Activity::class.java)
            startActivity(intent)
        }
    }
}
