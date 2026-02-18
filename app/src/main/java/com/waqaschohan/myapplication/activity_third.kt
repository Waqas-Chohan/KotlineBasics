package com.waqaschohan.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class activity_third : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnSimple=findViewById<Button>(R.id.btnSimple)
        btnSimple.setOnClickListener{
            val intent= Intent(this, activity_four::class.java)
            startActivity(intent)
        }
        val btnExtra=findViewById<Button>(R.id.btnExtra)
        btnExtra.setOnClickListener{
            val intent= Intent(this, activity_four::class.java)
            intent.putExtra("name","WaqasChohan")
            intent.putExtra("Age","22")
            intent.putExtra("source","btnExtra")
            startActivity(intent)
        }


        val btnBundle=findViewById<Button>(R.id.btnBundle)
        btnBundle.setOnClickListener{
            val intent= Intent(this, activity_four::class.java)
            val bundle=Bundle()
            bundle.putString("Name","Waqas Chohan")
            bundle.putString("source","Bundle")
            bundle.putInt("Age",22)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}