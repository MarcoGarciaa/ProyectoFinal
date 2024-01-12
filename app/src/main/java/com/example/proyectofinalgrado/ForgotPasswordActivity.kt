package com.example.proyectofinalgrado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class ForgotPasswordActivity : AppCompatActivity() {

    private lateinit var EditTextEmail: Button
    private lateinit var TextViewResult: Button
    private lateinit var btnSend: Button
    private lateinit var btnGoBack: ImageButton

    private lateinit var email: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        btnGoBack = findViewById(R.id.imageBtnGoBack)
        EditTextEmail= findViewById(R.id.editTextEmail)
        email = EditTextEmail.text.toString()
        TextViewResult = findViewById(R.id.textView2)
        btnSend = findViewById(R.id.btnSend)


        //GO BACK BUTTON
        btnGoBack.setOnClickListener {
            val intent = Intent(this, AuthenticationActivity::class.java)
            startActivity(intent)
        }

        //SEND BUTTON
        btnSend.setOnClickListener {
            if(email.isNotEmpty()){
                TextViewResult.text = "We already send you a new password, check you email account. This can take few minutes."

                //Insertar aqui funcion que envie un correo con la nueva contraseña.-------------------------------------------------------------------------

            } else {
                TextViewResult.text = "There cannot be empty fields."
            }
        }
    }
}