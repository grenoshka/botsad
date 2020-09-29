package com.example.botsad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_log_in.*

class LogIn : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        noAccountBtn.setOnClickListener {
            intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }
        logInBtn.setOnClickListener {
            intent = Intent(this, ChoosingName::class.java)
            startActivity(intent)
        }
    }
}
