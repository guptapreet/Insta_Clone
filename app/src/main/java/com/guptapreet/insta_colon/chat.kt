package com.guptapreet.insta_colon


import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class chat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chat)
        val iv_click_me = findViewById(R.id.imageView) as ImageView
        iv_click_me.setOnClickListener  {
            val intent = Intent(this@chat, MainActivity::class.java)
            startActivity(intent)
        }
    }
}