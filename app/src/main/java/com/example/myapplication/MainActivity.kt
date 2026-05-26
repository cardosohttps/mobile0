package com.example.myapplication;

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var imageview: ImageView? = null
    var btnCalcular: Button? = null
    var peso: EditText? = null
    var altura: EditText? = null
    var resul: TextView? = null
    var classi: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageview = findViewById<ImageView?>(R.id.imageView)
        btnCalcular = findViewById<Button?>(R.id.button)
        peso = findViewById<EditText?>(R.id.etPeso)
        altura = findViewById<EditText?>(R.id.etAltura)

        btnCalcular!!.setOnClickListener(View.OnClickListener { v: View? ->
            val i: Intent = Intent(getApplicationContext(), TelaResultado::class.java)
            val pesoStr = peso!!.getText().toString()
            val alturaStr = altura!!.getText().toString()

            i.putExtra("peso", pesoStr)
            i.putExtra("altura", alturaStr)
            startActivity(i)
        })
    }
}