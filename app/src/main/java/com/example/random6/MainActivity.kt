package com.example.random6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)
        val textView1 = findViewById<TextView>(R.id.textVien1)
        val textView2 = findViewById<TextView>(R.id.textVien2)
        val nerTextView = findViewById<TextView>(R.id.nerTextVien)

        btn.setOnClickListener {
            val random1 = Random.nextInt(100, 999) +1
            val random2 = Random.nextInt(100, 999) +1
            textView1.text = random1.toString()
            textView2.text = random2.toString()
            val res = when {
                random1 > random2 -> nerTextView.text = "$random1 > $random2"
                random1 < random2 -> nerTextView.text = "$random1 < $random2"

                else -> nerTextView.text = "$random1 = $random2"
            }
        }
    }
}