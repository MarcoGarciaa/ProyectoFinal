package com.example.proyectofinalgrado.singin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.proyectofinalgrado.LoginActivity
import com.example.proyectofinalgrado.R
import com.example.proyectofinalgrado.User

class SingInStep2Activity : AppCompatActivity() {

    private lateinit var btnGoBack: Button
    private lateinit var btnNext: Button

    private lateinit var Email: EditText
    private lateinit var PhoneNumber: EditText
    private lateinit var TextViewResult: TextView

    private lateinit var email: String
    private lateinit var phoneNumber: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_in_step2)


        val user = intent.getSerializableExtra("User") as User

        btnGoBack = findViewById(R.id.imageBtnGoBack2)
        btnNext = findViewById(R.id.btnNext2)
        TextViewResult = findViewById(R.id.textViewResult)

        Email = findViewById<EditText>(R.id.editTextEmail)
        email = Email.toString()

        PhoneNumber = findViewById<EditText>(R.id.editTextPhoneNumber)
        phoneNumber = PhoneNumber.toString()



        //GO BACK BUTTON
        btnGoBack.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        //NEXT BUTTON
        btnNext.setOnClickListener {
            if(email.isNotEmpty()){

                user.setPhoneNumber(phoneNumber)
                user.setEmail(email)

                val intent = Intent(this, SingInStep2Activity::class.java)
                intent.putExtra("User",user)
                startActivity(intent)

            } else {
                TextViewResult.setTextColor(ContextCompat.getColor(this,R.color.warning))
                TextViewResult.text = "You must put an email."
            }

        }
    }
}