package com.intellectitech.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text=findViewById<TextView>(R.id.textview)
        text.setOnClickListener {
            val inten = Intent(this,HomeActivity::class.java)
            startActivity(inten)
        }





        val loginbtn = findViewById<Button>(R.id.button)
        loginbtn.setOnClickListener{
            val i = Intent(this,HomeActivity::class.java)
            startActivity(i)
        }
    }
}