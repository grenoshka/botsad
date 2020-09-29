package com.example.botsad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        logInBtn.setOnClickListener {
            intent = Intent(this, LogIn::class.java)
            startActivity(intent)
        }
        signUpBtn.setOnClickListener {
            intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }
    }
}
