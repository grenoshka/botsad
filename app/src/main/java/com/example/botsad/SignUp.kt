package com.example.botsad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        algreadyHaveAccount.setOnClickListener {
            intent = Intent(this, LogIn::class.java)
            startActivity(intent)
        }
        logIntoApp.setOnClickListener {
            intent = Intent(this, ChoosingName::class.java)
            startActivity(intent)
        }
    }
}
