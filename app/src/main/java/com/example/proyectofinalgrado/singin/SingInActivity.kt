package com.example.proyectofinalgrado.singin


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.proyectofinalgrado.AuthenticationActivity
import com.example.proyectofinalgrado.R

class SingInActivity : AppCompatActivity() {

    private lateinit var btnGoBack: Button
    private lateinit var btnSingInGoogle: Button
    private lateinit var btnSingInFacebook: Button
    private lateinit var btnSingInManual: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_in)

        btnGoBack = findViewById(R.id.imageBtnGoBack)
        btnSingInGoogle = findViewById(R.id.btnSingInGoogle)
        btnSingInFacebook = findViewById(R.id.btnSingInFacebook)
        btnSingInManual = findViewById(R.id.btnSingInManual)

        //GO BACK
        btnSingInGoogle.setOnClickListener {
            val intent = Intent(this, AuthenticationActivity::class.java)
            startActivity(intent)
        }
        //SING IN GOOGLE
        btnSingInGoogle.setOnClickListener {
            // MARCO AÑADE FUNCION!!------------------------------------------------------------------------------------------------------------
        }
        //SING IN FACEBOOK
        btnSingInFacebook.setOnClickListener {
            // MARCO AÑADE FUNCION!!------------------------------------------------------------------------------------------------------------
        }
        //SING IN MANUAL
        btnSingInManual.setOnClickListener {
            val intent = Intent(this, SingInStep1Activity::class.java)
            startActivity(intent)
        }
    }
}
