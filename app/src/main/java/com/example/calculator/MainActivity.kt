package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var num1:EditText
    lateinit var num2:EditText
    lateinit var btnmultiply:Button
    lateinit var  btndivide:Button
    lateinit var btnadd:Button
    lateinit var btnsubtract:Button
    lateinit var tvresult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        num1=findViewById(R.id.num1)
        num2=findViewById(R.id.num2)
        btnadd=findViewById(R.id.btnadd)
        btndivide=findViewById(R.id.btndivide)
        btnsubtract=findViewById(R.id.btnsubstract)
        btnmultiply=findViewById(R.id.btnmultiply)
        tvresult=findViewById(R.id.tvresult)
        btnadd.setOnClickListener {
        val num=num1.text.toString().toDouble()
        val nums=num2.text.toString().toDouble()
        val answer=num +nums
        tvresult.text="Result: $answer"
        }
        btnsubtract.setOnClickListener {
            val num=num1.text.toString().toDouble()
            val nums=num2.text.toString().toDouble()
            val answer=num-nums
            tvresult.text="Result: $answer"

        }
        btnmultiply.setOnClickListener {
            val num=num1.text.toString().toDouble()
            val nums=num2.text.toString().toDouble()
            val answer=num*nums
            tvresult.text="Result: $answer"

        }
        btndivide.setOnClickListener {
            val num=num1.text.toString().toDouble()
            val nums=num2.text.toString().toDouble()
            val answer=num/nums
            tvresult.text="Result: $answer"

        }
    }
}