package com.example.route.CousesScreen.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Course(val name: String, val image: Int, val content: String) : Parcelable