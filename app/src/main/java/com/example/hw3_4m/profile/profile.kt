package com.example.hw3_4m.profile

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Profile(
    val img: String,
    val name: String
): Parcelable