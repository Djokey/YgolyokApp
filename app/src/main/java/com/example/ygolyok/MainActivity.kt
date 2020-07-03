package com.example.ygolyok

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    //Создаем будущие переменные
    lateinit var postSpinner: Spinner
    lateinit var posts: Array<String>
    lateinit var selectedSpinerPost: Any
    //Создали будущие переменные

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Заполняем спинер с поставщиками
        postSpinner = findViewById(R.id.post_spinner) as Spinner
        posts = arrayOf("Выберите поставщика","Аршановский","Кирбинский","Черногорский","Изыхский")
        postSpinner.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,posts)
        //Заполнили спинер с поставщиками

        //Создаем реакцию на выбор поставщика
        postSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {}
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
//                selectedSpinerPost = postSpinner.selectedItem.toString() //Строковый вариант выбранного спинера
                val postsSpinnerSize = posts.size
                for (i in 0..postsSpinnerSize) {
                    if (i == 0) {
//                        var markaTextView : TextView =
                    }


                    //                    var text = findViewById<TextView>(R.id.textView8)
                    //                    text.text = selected.toString()

                }
            }
        }
        //Закончили с выбором поставщика - конец реакции







    }




}