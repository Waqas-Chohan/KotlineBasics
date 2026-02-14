package com.waqaschohan.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MainActivity", "OnCreate")
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        if (savedInstanceState == null) {
            Log.d("MainActivity", "MainFirstTime")

        } else {
            Log.d("MainActivity", "MainAccessedAgain")
        }
        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResumed")
        Toast.makeText(this, "MainActivity:onResume", Toast.LENGTH_SHORT).show()

    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStarted")
        Toast.makeText(this, "MainActivity:onStart", Toast.LENGTH_SHORT).show()

    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPaused")
        Toast.makeText(this, "MainActivity:onPause", Toast.LENGTH_SHORT).show()

    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStopped")
        Toast.makeText(this, "MainActivity:onStop", Toast.LENGTH_SHORT).show()

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroyed")
        Toast.makeText(this, "MainActivity:onDestroy", Toast.LENGTH_SHORT).show()

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity", "onRestarted")
        Toast.makeText(this, "MainActivity:onRestart", Toast.LENGTH_SHORT).show()

    }


}