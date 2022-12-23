package com.samiun.navgivationscrach

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Trainee(
    val fistName: String,
    val lastName: String,
    val id: Int
): Parcelable