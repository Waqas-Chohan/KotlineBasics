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

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("SecondActivity", "onCreate")
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        if (savedInstanceState == null) {
            Log.d("SecondActivity", "CreatedFirstTime")
        } else {
            Log.d("SecondActivity", "SecondAccessedAgain")
        }


        val button1: Button = findViewById(R.id.button2)
        button1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onResume() {
        super.onResume()
        Log.d("SecondActivity", "onResumed")
        Toast.makeText(this, "SecondActivity:onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d("SecondActivity", "onStarted")
        Toast.makeText(this, "SecondActivity:onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("SecondActivity", "onPaused")
        Toast.makeText(this, "SecondActivity:onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("SecondActivity", "onStopped")
        Toast.makeText(this, "SecondActivity:onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SecondActivity", "onDestroyed")
        Toast.makeText(this, "SecondActivity:onDestroy", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("SecondActivity", "onRestarted")
        Toast.makeText(this, "SecondActivity:onRestart", Toast.LENGTH_SHORT).show()
    }


}