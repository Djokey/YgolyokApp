package com.example.ygolyok

import android.view.View
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class FavFun(){//Этот класс исользуется для разгрузки кода в MainActivity
    //Для реакции на выбор поставщика
    fun ShowChanges(p1 : TextView, p2 : Spinner){
        p1.visibility = View.VISIBLE
        p2.visibility = View.VISIBLE
    }
    fun ShowChangesPrice(p1 : TextView, p2 : TextView, p3 : TextView, p4 : Button, p5 : TextView){
        p1.visibility = View.VISIBLE
        p2.visibility = View.VISIBLE
        p3.visibility = View.VISIBLE
        p4.visibility = View.VISIBLE
        p5.visibility = View.VISIBLE
    }
    fun HideChanges(p1 : TextView, p2 : Spinner, p3 : TextView, p4 : TextView, p5 : TextView, p6 : Button, p7 : TextView){
        p1.visibility = View.INVISIBLE
        p2.visibility = View.INVISIBLE
        p3.visibility = View.INVISIBLE
        p4.visibility = View.INVISIBLE
        p5.visibility = View.INVISIBLE
        p6.visibility = View.INVISIBLE
        p7.visibility = View.INVISIBLE
    }
    //Для реакции на выбор поставщика
}