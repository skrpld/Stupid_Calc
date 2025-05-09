package com.example.stupid_calc

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View) {
        val editText1: EditText = findViewById(R.id.editText1)
        val editText2: EditText = findViewById(R.id.editText2)

        try {
            val result = editText1.text.toString().toDouble() + editText2.text.toString().toDouble()
            val intent = Intent(this, ResultOfCalcActivity::class.java)
            intent.putExtra("result", result)
            startActivity(intent)
        } catch (e: NumberFormatException) {
            Toast.makeText(this, "Введите 2 числа", Toast.LENGTH_SHORT).show()
        }
    }

}