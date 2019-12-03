package com.example.deadofwinterdieroller

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dieImage: ImageView = findViewById(R.id.die_image)
        dieImage.setImageResource(R.drawable.bite)
    }
}
