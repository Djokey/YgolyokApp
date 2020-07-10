package com.example.ygolyok

class FavDB(){//Этот класс используется как БД, поскольку БД у нас нет
    //Поставщики загруженные с БД
    val DBInfoPosts : Array<String> =  arrayOf("Выберите поставщика","Аршановский","Кирбинский","Черногорский","Изыхский")
    //Поставщики загруженные с БД

    //Марки угля поставщиков загруженных с БД
    val DBInfoPostArshan : Array<String> =  arrayOf("ДМСШ 0-25","ДО 25-50","ДПК 50-200","ДР 0-300","Обогащенный")
    val DBInfoPostKirbi : Array<String> =  arrayOf("ДМСШ 0-25","ДО 25-50","ДПК 50-200","ДР 0-300")
    val DBInfoPostChern : Array<String> =  arrayOf("ДМСШ 0-25","ДО 25-50","ДПК 50-200","ДР 0-300","Рядовка")
    val DBInfoPostIzuh : Array<String> =  arrayOf("ДМСШ 0-25","ДО 25-50","ДПК 50-200","ДР 0-300","Порода")
    //Марки угля поставщиков загруженных с БД

    //Цены на каждую марку угля от разных поставщиков с БД
    val DBInfoArshanPrices : Array<String> =  arrayOf("1500","1700","1900","1200","2200")
    val DBInfoKirbiPrices : Array<String> =  arrayOf("1400","1600","2000","1500")
    val DBInfoChernPrices : Array<String> =  arrayOf("1550","1770","1970","1270","2000")
    val DBInfoIzuhPrices : Array<String> =  arrayOf("1440","1660","1700","1100","1900")
    //Цены на каждую марку угля от разных поставщиков с БД
}