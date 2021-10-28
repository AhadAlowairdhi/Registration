package com.example.registration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var signInBt :Button
    lateinit var signUpBt :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signInBt=findViewById(R.id.signInBtn)
        signInBt.setOnClickListener {
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)
        }

        signUpBt=findViewById(R.id.signUpBtn)
        signUpBt.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)

        }
    }
}