package com.kotlindersleri.getirbasic.data.entity

import java.io.Serializable

data class Urunler(var id:Int,var ad:String,var resim:String,var fiyat:Int) :Serializable {
}