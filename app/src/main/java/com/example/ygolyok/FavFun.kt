package com.example.ygolyok

import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.TextView
import android.widget.ArrayAdapter


//Для реакции на выбор поставщика
class FavFun(){
    fun ShowChanges(p1 : TextView, p2 : Spinner){
        p1.visibility = View.VISIBLE
        p2.visibility = View.VISIBLE
    }
    fun HideChanges(p1 : TextView, p2 : Spinner){
        p1.visibility = View.INVISIBLE
        p2.visibility = View.INVISIBLE
    }

//                p1.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,postArshan)
//                p1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//                    override fun onNothingSelected(p0: AdapterView<*>?) {}
//                    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {}
//        p2.adapter = ArrayAdapter<String>(MainActivity(), android.R.layout.simple_list_item_1, postMarka)
//        var postArshan = FavDB().DBInfoPostArshan
//        var postKirbi = FavDB().DBInfoPostKirbi
//        var postChern = FavDB().DBInfoPostChern
//        var postIzuh = FavDB().DBInfoPostIzuh
//        p1.adapter = ArrayAdapter<String>(this, R.layout.simple_list_item_1,posts)
//Для реакции на выбор поставщика
}