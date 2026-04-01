package com.example.multiply_table2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.jvm.java

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Created variables to hold UI elements
        val multiplyBtn = findViewById<Button>(R.id.multiplyBtn)
        val numTxtInput = findViewById<EditText>(R.id.numTxtInput)

        //Created a set click listener input
        multiplyBtn.setOnClickListener {
            //create the explicit intent
            val intent = Intent(this, MultiplicationTable::class.java )
            intent.putExtra("tableNumber", numTxtInput.text.toString())
            // start the activity
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.titleTxt)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}