package com.example.deadofwinterdieroller

import android.annotation.SuppressLint
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var die = Die()

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dieImage: ImageView = findViewById(R.id.die_image)
        val screenLayout: LinearLayout = findViewById(R.id.screen_layout)

        dieImage.setImageResource(R.drawable.bite)
        dieImage.setBackgroundResource(R.drawable.dice_rolling_animation)
        val rollAnimation: AnimationDrawable = dieImage.background as AnimationDrawable

        screenLayout.setOnTouchListener(View.OnTouchListener { _, motionEvent ->
            when (motionEvent.action) {
                MotionEvent.ACTION_DOWN -> {
                    dieImage.setImageDrawable(null)
                    rollAnimation.start()
                }
                MotionEvent.ACTION_UP -> {
                    dieImage.setImageResource(R.drawable.bite)
                }
            }
            return@OnTouchListener true
        })
    }
}
