package com.guptapreet.insta_colon


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val iv_click_me = findViewById(R.id.imageView1) as ImageView
        // set on-click listener
        iv_click_me.setOnClickListener {
            val i = Intent(this@MainActivity, chat::class.java)
            startActivity(i)
        }
    }
}