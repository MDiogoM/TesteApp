package com.example.ecocidade.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UserActivity(
    val id: String,
    val userId: String,
    val wasteCategory: String,
    val weight: Double,
    val timestamp: Long,
    val location: String
) : Parcelable