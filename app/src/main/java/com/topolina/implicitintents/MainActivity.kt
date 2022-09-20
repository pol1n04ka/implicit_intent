package com.topolina.implicitintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.topolina.implicitintents.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // Binding for layout
    private lateinit var b: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        val view = b.root
        setContentView(view)


    }
}