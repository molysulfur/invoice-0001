package com.example.molys.dynamicrecyclerview.model

import com.google.gson.annotations.SerializedName

data class InvoiceItem(
        @SerializedName("icon") var icon : String = "",
        @SerializedName("title") var title: String = "",
        @SerializedName("desc") var desc : String = "",
        @SerializedName("total_price") var totalPrice : String = "",
        @SerializedName("tax") var tax : String = ""
)