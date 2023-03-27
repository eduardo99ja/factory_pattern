package com.apodaca.factorypattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val TAG = "myTag"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val breadFactory = BreadFactory()
        val bread = breadFactory.getBread("BAG")

        textView.text = StringBuilder()
            .append(bread!!.name())
            .append("\n")
            .append(breadFactory.getBread("ROL")!!.name())
            .append("\n")
            .append(breadFactory.getBread("SLI")!!.name())

        Log.e(TAG, bread.name())
    }
}