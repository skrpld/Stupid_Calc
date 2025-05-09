package com.example.stupid_calc

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultOfCalcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_of_calc)

        val intent: Intent = intent
        val result: Double = intent.getDoubleExtra("result", 0.0)
        val resultText: TextView = findViewById(R.id.resultText)
        resultText.text = result.toString()
    }
}