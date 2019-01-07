package com.example.molys.dynamicrecyclerview.model

import com.google.gson.annotations.SerializedName

data class TotalBill(
        @SerializedName("price") val price : String = "",
        @SerializedName("due_date") var dueDate: String = ""
)