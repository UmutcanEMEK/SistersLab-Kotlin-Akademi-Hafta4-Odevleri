package com.example.medium

open class OgrenciBilgileri(var adi:String, var soyadi:String, var okulNo:Int) {

    fun yazdir(){
        println("Öğrencinin Adı: $adi")
        println("Öğrencinin Soyadı: $soyadi")
        println("Öğrenci Numarası: $okulNo")
    }
}
