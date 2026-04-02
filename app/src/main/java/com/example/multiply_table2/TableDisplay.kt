package com.example.multiply_table2

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TableDisplay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_table_display)

        //assigning data from main page
        val bundle: Bundle? = intent.extras
        //getting the number entered
        val tableString: String? = bundle?.getString("tableNumber")
        //converting the string back
        val tableNumber = tableString!!.toInt()
        val multiplyTable = findViewById<TextView>(R.id.tableDisplayTxt)
        val timesDisplay: String = "$tableNumber x tables\n\n"

        //
        multiplyTable.text = timesDisplay

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}