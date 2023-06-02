package com.falcon.calculator_mad_final_test

import android.util.Log

class CalLogic(private var num1:Float? = 0.0f, private var  num2:Float? = 0.0f, var answer:Float? = 0.0f) {

    fun addition(num1:Float?,num2:Float?):Float?{

        answer = (num1?:0.0f) + (num2?:0.0f)
        Log.e("point","Paasing Bravo : ${answer} ")
        return answer
    }

    fun substitution(num1:Float?,num2:Float?):Float?{
        answer = (num1?:0.0f) - (num2?:0.0f)
        return answer
    }

    fun multiplication(num1:Float?,num2:Float?):Float?{
        answer = (num1?:0.0f) * (num2?:0.0f)
        return answer
    }

    fun divition(num1:Float?,num2:Float?):Float?{
        answer = (num1?:0.0f) / (num2?:0.0f)
        return answer
    }
}