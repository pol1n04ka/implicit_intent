package com.topolina.implicitintents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import com.topolina.implicitintents.databinding.ActivityMainBinding
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    // Binding for layout
    private lateinit var b: ActivityMainBinding

    val getContent = registerForActivityResult(ActivityResultContracts.GetContent()) {
        b.imageView.setImageURI(it)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        val view = b.root
        setContentView(view)

        b.btnChoose.setOnClickListener {
            getContent.launch("image/*")
        }
    }
}