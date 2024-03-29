package com.example.proyectofinalgrado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ChargingScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_charging_screen)

        val duracion = 2500 as Long

        android.os.Handler().postDelayed({
            val intent = Intent(this, AuthenticationActivity::class.java)
            startActivity(intent)
        }, duracion)
    }
}