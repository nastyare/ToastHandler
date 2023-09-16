package com.example.toasthandler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var myButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //связали переменную с элементом в разметке
        myButton = findViewById(R.id.button_ok)
        //обработчик нажатия
        myButton.setOnClickListener { showToast() }
    }

    fun showToast() {
        //как вызывать всплывающее сообщение
        val myToast = Toast.makeText(this, "Вы нажали кнопку", Toast.LENGTH_LONG)
        //показываем
        myToast.show()
    }
}