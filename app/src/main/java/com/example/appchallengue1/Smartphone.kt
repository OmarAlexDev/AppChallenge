package com.example.appchallengue1

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Smartphone(val picture:Int, val modelo:String, val marca:String, val anio:String, val review: String) :
    Parcelable

