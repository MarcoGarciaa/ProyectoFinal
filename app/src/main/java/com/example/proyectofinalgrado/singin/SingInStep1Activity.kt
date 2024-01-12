package com.example.proyectofinalgrado.singin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.proyectofinalgrado.LoginActivity
import com.example.proyectofinalgrado.R
import com.example.proyectofinalgrado.User

class SingInStep1Activity : AppCompatActivity() {

    private lateinit var btnGoBack: ImageButton
    private lateinit var btnNext: Button

    private lateinit var Username: EditText
    private lateinit var Password: EditText
    private lateinit var RepeatPassword: EditText
    private lateinit var TextViewResult: TextView

    private lateinit var username: String
    private lateinit var password: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_in_step1)

        btnGoBack = findViewById(R.id.imageBtnGoBack1)
        btnNext = findViewById(R.id.btnNext1)

        Username = findViewById<EditText>(R.id.editTextUsername)
        username = Username.toString()
        TextViewResult = findViewById(R.id.textViewResult)

        Password = findViewById<EditText>(R.id.editTextPassword)
        RepeatPassword = findViewById<EditText>(R.id.editTextRepeatPassword)


        //GO BACK BUTTON
        btnGoBack.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        //NEXT BUTTON
        btnNext.setOnClickListener {
            if(Password==RepeatPassword){
                password=Password.text.toString()
                if(username.isNotEmpty() && password.isNotEmpty()){
                    val user = User()
                    user.setUsername(username)
                    user.setPassword(password)

                    val intent = Intent(this, SingInStep2Activity::class.java)
                    intent.putExtra("User",user)
                    startActivity(intent)
                } else {
                    TextViewResult.setTextColor(ContextCompat.getColor(this,R.color.warning))
                    TextViewResult.text = "There cannot be empty fields."
                }
            }else {
                TextViewResult.setTextColor(ContextCompat.getColor(this,R.color.warning))
                TextViewResult.text = "Password must be the same."
            }
        }
    }
}