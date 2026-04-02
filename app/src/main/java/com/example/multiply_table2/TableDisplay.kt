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
        var timesDisplay: String = "$tableNumber x tables\n\n"


        //creating count for while loop
        var count = 1


        //
        multiplyTable.text = timesDisplay

        while (count <=10){




            //Addding a continue
            if (count ==4){
                count++
                continue
            }
            //example user enters 5 and count is 50: 5 x 1 = 5 (answer)
            val answer = tableNumber * count
            /*displays as:
             5 x tables

             */




            timesDisplay += "$tableNumber x $count = ${answer}\n"

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}