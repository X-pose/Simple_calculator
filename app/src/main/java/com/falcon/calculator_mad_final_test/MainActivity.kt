package com.falcon.calculator_mad_final_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.falcon.calculator_mad_final_test.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

/*This app do not use Intents(for now). Instead it gets user inputs and displays results on the same activity (Main Activity)
The app will get the user inputs from two EditText fields (Type : Number) and displays the answer using a TextView field
 */


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        initialization databinding

        lateinit var binding :ActivityMainBinding
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)




        /* Declaring a var (Variable :- since this value has to be mutable) of a TextView type and assigning the
        TextView(The one we're going to show the result) to it.
        */
        var answerTxt: TextView = binding.answerTxt


        /*In here, we are creating an instance of CalLogic class, which contains the arithmetic operation logics.
            Note that Kotlin does not use "new" keyword to create new instances of a class
         */
        val logic = CalLogic()

        /*In here, we are implementing what should happen when the user clicks on the button.
            Note that we are assigning EditText values to variables when the user clicks on the button.
            That's because if we initialize these variables before the user enters any value, it will try to parse null values into strings
            and therefore crash the app.

            What should happen when the user clicks on the button ? :-
                1. Get the EditText values and convert them into Float values.
                        -->> To do that, you need to retrieve the EditText value and access its text part using ".text".
                             Then, you have to convert it to a string using the "toString()" function and further convert it to Float values
                             using the "toFloat()" function.

                2. Pass the above values to the respective function and get the answer
                        -->> To do that, you can utilize the previously created CalLogic class object (named "logic" in this case) and use the ".method" to
                             access the object's methods.

                3. Assign the answer value to the TextView
                        -->> We utilize the TextView variable declared in line 32 and set its text to a custom one that includes our answer.

                 That's it!
         */


        binding.btnAdd.setOnClickListener {
            var num1:Float? = binding.edtNumber1.text.toString().toFloat()
            var num2:Float? = binding.edtTxtNumber2.text.toString().toFloat()
            val ans = logic.addition(num1, num2)
            answerTxt.text = "Answer : "+ ans.toString()
        }

        binding.btnSub.setOnClickListener {
            var num1:Float? = binding.edtNumber1.text.toString().toFloat()
            var num2:Float? = binding.edtTxtNumber2.text.toString().toFloat()
            val ans = logic.substitution(num1, num2)
            answerTxt.text = "Answer : "+ ans.toString()
        }

        binding.btnMult.setOnClickListener {

            var num1:Float? = binding.edtNumber1.text.toString().toFloat()
            var num2:Float? = binding.edtTxtNumber2.text.toString().toFloat()
            val ans = logic.multiplication(num1, num2)
            answerTxt.text = "Answer : "+ ans.toString()
        }

        binding.btnDiv.setOnClickListener {
            var num1:Float? = binding.edtNumber1.text.toString().toFloat()
            var num2:Float? = binding.edtTxtNumber2.text.toString().toFloat()
            val ans = logic.divition(num1, num2)
            answerTxt.text = "Answer : "+ ans.toString()
        }
    }
}