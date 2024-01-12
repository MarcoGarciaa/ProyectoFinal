package com.example.proyectofinalgrado.singin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.proyectofinalgrado.R
import com.example.proyectofinalgrado.User

class SingInStep4Activity : AppCompatActivity() {

    private lateinit var btnGoBack: Button
    private lateinit var btnCreate: Button

    private lateinit var Bibliography: EditText

    private lateinit var bibliography: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_in_step4)

        val user = intent.getSerializableExtra("User") as User

        btnGoBack = findViewById(R.id.imageBtnGoBack4)
        btnCreate = findViewById(R.id.btnCreate)

        Bibliography = findViewById<EditText>(R.id.editTextBibliography)
        bibliography = Bibliography.toString()


        //GO BACK BUTTON
        btnGoBack.setOnClickListener {
            val intent = Intent(this, SingInActivity::class.java)
            intent.putExtra("User",user)
            startActivity(intent)
        }

        //NEXT BUTTON
        btnCreate.setOnClickListener {
            user.setBibliography(bibliography)

            // Con el objeto "user" creado añadir a firebase---------------------------------------------------------------------------------

            val intent = Intent(this, SingInStep2Activity::class.java)
            intent.putExtra("User",user)
            startActivity(intent)
        }
    }
}