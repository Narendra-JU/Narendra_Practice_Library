package com.example.practiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.jitpack.api.Help
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            Help.getToast(this)
        }
    }
}