package com.falcon.calculator_mad_final_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAdd: Button = findViewById(R.id.btnAdd)
        val btnSub: Button = findViewById(R.id.btnSub)
        val btnMult: Button = findViewById(R.id.btnMult)
        val btnDiv: Button = findViewById(R.id.btnDiv)

        var answerTxt: TextView = findViewById(R.id.answerTxt)



        val logic = CalLogic()

        btnAdd.setOnClickListener {
            var num1:Float? = findViewById<EditText?>(R.id.edtNumber1).text.toString().toFloat()
            var num2:Float? = findViewById<EditText?>(R.id.edtTxtNumber2).text.toString().toFloat()
            Log.e("point","Paasing alpha with ${num1} + ${num2}")
            val ans = logic.addition(num1, num2)
            answerTxt.text = "Answer : "+ ans.toString()
        }

        btnSub.setOnClickListener {
            var num1:Float? = findViewById<EditText?>(R.id.edtNumber1).text.toString().toFloat()
            var num2:Float? = findViewById<EditText?>(R.id.edtTxtNumber2).text.toString().toFloat()
            val ans = logic.substitution(num1, num2)
            answerTxt.text = "Answer : "+ ans.toString()
        }

        btnMult.setOnClickListener {

            var num1:Float? = findViewById<EditText?>(R.id.edtNumber1).text.toString().toFloat()
            var num2:Float? = findViewById<EditText?>(R.id.edtTxtNumber2).text.toString().toFloat()
            val ans = logic.multiplication(num1, num2)
            answerTxt.text = "Answer : "+ ans.toString()
        }

        btnDiv.setOnClickListener {
            var num1:Float? = findViewById<EditText?>(R.id.edtNumber1).text.toString().toFloat()
            var num2:Float? = findViewById<EditText?>(R.id.edtTxtNumber2).text.toString().toFloat()
            val ans = logic.divition(num1, num2)
            answerTxt.text = "Answer : "+ ans.toString()
        }
    }
}