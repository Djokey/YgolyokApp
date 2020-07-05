package com.example.ygolyok

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    fun FullMarksSpinner(p1:Int,p2:Spinner){
        var postMarka: Array<String> = arrayOf("123")
        when(p1){
            1 -> {
                postMarka = FavDB().DBInfoPostArshan
                p2.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, postMarka)
            }
            2 -> {
                postMarka = FavDB().DBInfoPostKirbi
                p2.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, postMarka)
            }
            3 -> {
                postMarka = FavDB().DBInfoPostChern
                p2.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, postMarka)
            }
            4 -> {
                postMarka = FavDB().DBInfoPostIzuh
                p2.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, postMarka)
            }
        }
    }
//                p1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//                    override fun onNothingSelected(p0: AdapterView<*>?) {}
//                    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {}
//        p2.adapter = ArrayAdapter<String>(MainActivity(), android.R.layout.simple_list_item_1, postMarka)
//        p1.adapter = ArrayAdapter<String>(this, R.layout.simple_list_item_1,posts)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Заполняем спинер с поставщиками
        val markaSpinner : Spinner = findViewById<Spinner>(R.id.marka_spinner)
        val postSpinner : Spinner = findViewById<Spinner>(R.id.post_spinner)
        val posts : Array<String> = FavDB().DBInfoPost
        postSpinner.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,posts)
        //Заполнили спинер с поставщиками

        //Подключаем доп переменные
        val markaTextView : TextView = findViewById<TextView>(R.id.textView2)
        val log: TextView = findViewById<TextView>(R.id.log)
        //Подключаем доп переменные

        //Создаем реакцию на выбор поставщика
        postSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {}
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val selectedSpinnerPost : Int = postSpinner.selectedItemId.toInt() //Целочисленный вариант выбранного спинера
                if (selectedSpinnerPost == 0){
                    FavFun().HideChanges(markaTextView, markaSpinner)
                }
                if (selectedSpinnerPost > 0){
                    FavFun().ShowChanges(markaTextView, markaSpinner)
                    FullMarksSpinner(selectedSpinnerPost, markaSpinner)
                }
            }
        }
        //Закончили с выбором поставщика - конец реакции

        //Создаем реакцию на выбор Марки
        markaSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {}
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {}
        }
        //Создаем реакцию на выбор Марки





    }




}