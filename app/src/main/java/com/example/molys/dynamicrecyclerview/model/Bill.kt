package com.example.molys.dynamicrecyclerview.model

import com.google.gson.annotations.SerializedName

data class Bill(
        @SerializedName("icon") var icon : String = "",
        @SerializedName("company_name") var companyName : String = "",
        @SerializedName("address") var address : String = ""
)