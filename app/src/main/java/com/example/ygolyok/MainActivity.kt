package com.example.ygolyok

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Заполняем спинер
        val option : Spinner = findViewById(R.id.post_spinner)
        val Post: Array<String> = arrayOf("Выберите поставщика","Аршановский","Кирбинский","Черногорский","Изыхский")
        option.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Post)
        //Заполнили первый спинер

    }




}