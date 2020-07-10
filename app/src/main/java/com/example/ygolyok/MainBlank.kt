package com.example.ygolyok

import android.os.Bundle
import android.text.InputFilter
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.main_blank.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MainBlank.newInstance] factory method to
 * create an instance of this fragment.
 */

class MainBlank : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.main_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button.setOnClickListener{
            view.findNavController().navigate(R.id.action_mainBlank_to_googleMap)
        }

        fun FullMarksSpinner(p1:Int,p2: Spinner){
            val postMarka: Array<String>
            when(p1){
                1 -> {
                    postMarka = FavDB().DBInfoPostArshan
                    p2.adapter = activity?.let {
                        ArrayAdapter<String>(
                            it,
                            android.R.layout.simple_list_item_1,
                            postMarka
                        )
                    }
                }
                2 -> {
                    postMarka = FavDB().DBInfoPostKirbi
                    p2.adapter = activity?.let {
                        ArrayAdapter<String>(
                            it,
                            android.R.layout.simple_list_item_1,
                            postMarka
                        )
                    }
                }
                3 -> {
                    postMarka = FavDB().DBInfoPostChern
                    p2.adapter = activity?.let {
                        ArrayAdapter<String>(
                            it,
                            android.R.layout.simple_list_item_1,
                            postMarka
                        )
                    }
                }
                4 -> {
                    postMarka = FavDB().DBInfoPostIzuh
                    p2.adapter = activity?.let {
                        ArrayAdapter<String>(
                            it,
                            android.R.layout.simple_list_item_1,
                            postMarka
                        )
                    }
                }
            }
        }
        //Заполняем спинер с поставщиками
        val butmap : Button = view.findViewById(R.id.button)
        val addrestext : TextView = view.findViewById(R.id.address)
        val markaSpinner : Spinner = view.findViewById(R.id.marka_spinner)
        val pricetext : TextView = view.findViewById(R.id.textView3)
        val massatext : TextView = view.findViewById(R.id.textView4)
        val massavvod : TextView = view.findViewById(R.id.editmassa)
        val postSpinner : Spinner = view.findViewById(R.id.post_spinner)
        val posts : Array<String> = FavDB().DBInfoPosts
        postSpinner.adapter = activity?.let {
            ArrayAdapter<String>(
                it,
                android.R.layout.simple_list_item_1,
                posts)
        }
        //Заполнили спинер с поставщиками

        //Подключаем доп переменные
        // val map =
        val editMassa : EditText = view.findViewById(R.id.editmassa);
        val markaTextView : TextView = view.findViewById<TextView>(R.id.textView2)
        val log: TextView = view.findViewById<TextView>(R.id.log)
        var PricesMarks : Array<String> = arrayOf("its fine")
        //Подключаем доп переменные

        //Создаем реакцию на выбор поставщика
        postSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {}
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val selectedSpinnerPost : Int = postSpinner.selectedItemId.toInt() //Целочисленный вариант выбранного спинера
                if (selectedSpinnerPost == 0){
                    FavFun().HideChanges(markaTextView, markaSpinner, pricetext, massatext, massavvod, butmap, addrestext)
                }
                if (selectedSpinnerPost > 0){
                    FavFun().ShowChanges(markaTextView, markaSpinner)
                    FullMarksSpinner(selectedSpinnerPost, markaSpinner)
                    when(selectedSpinnerPost){
                        1 -> PricesMarks = FavDB().DBInfoArshanPrices
                        2 -> PricesMarks = FavDB().DBInfoKirbiPrices
                        3 -> PricesMarks = FavDB().DBInfoChernPrices
                        4 -> PricesMarks = FavDB().DBInfoIzuhPrices
                    }
                }
            }
        }
        //Закончили с выбором поставщика - конец реакции

        //Создаем реакцию на выбор Марки Угля
        markaSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {}
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val selectedSpinnerMarka : Int = markaSpinner.selectedItemId.toInt()
                FavFun().ShowChangesPrice(pricetext, massatext, massavvod, butmap, addrestext)
                when(selectedSpinnerMarka){
                    0 -> pricetext.text = "Цена за тонну: ${PricesMarks[0]}"
                    1 -> pricetext.text = "Цена за тонну: ${PricesMarks[1]}"
                    2 -> pricetext.text = "Цена за тонну: ${PricesMarks[2]}"
                    3 -> pricetext.text = "Цена за тонну: ${PricesMarks[3]}"
                    4 -> pricetext.text = "Цена за тонну: ${PricesMarks[4]}"
                }
            }
        }
        //Создаем реакцию на выбор Марки Угля

        //Фильтр для поля ввода массы угля
        editMassa.filters = arrayOf<InputFilter>(InputFilterMinMax(1, 40))
        //Фильтр для поля ввода массы угля
        // Inflate the layout for this fragment
    }



    companion object {

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MainBlank.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MainBlank().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}