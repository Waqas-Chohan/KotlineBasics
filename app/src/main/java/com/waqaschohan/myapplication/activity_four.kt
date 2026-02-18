package com.waqaschohan.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_four : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_four)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val intent = intent
        val source = intent.getStringExtra("source")

        when (source) {
            "btnExtra"->{
                val name=intent.getStringExtra("name")
                val age = intent.getIntExtra("age", 0)
                Toast.makeText(this,"Launched from the BtnExtra\nname=$name |age=$age",Toast.LENGTH_SHORT).show()
            }
            "Bundle"->{
                val bundle=intent.extras
                val name=bundle?.getString("name")
                val age=bundle?.getInt("age",0)
                Toast.makeText(this,"Launched from the BtnExtra\nname=$name |age=$age",Toast.LENGTH_SHORT).show()
            }
            else->Toast.makeText(this,"Launched without the extras",Toast.LENGTH_SHORT).show()
        }
    }
}