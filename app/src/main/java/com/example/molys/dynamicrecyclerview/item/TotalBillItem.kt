package com.example.molys.dynamicrecyclerview.item

import android.annotation.SuppressLint
import com.example.molys.dynamicrecyclerview.InvoiceCreator
import com.example.molys.dynamicrecyclerview.model.TotalBill
import java.sql.Timestamp
import java.text.SimpleDateFormat

class TotalBillItem : BaseItem {
    var totalPrice : String
    var dueDate : String

    @SuppressLint("SimpleDateFormat")
    constructor(totalBill :TotalBill) : super(InvoiceCreator.TYPE_TOTAL) {
        totalPrice = totalBill.price
        val sampleDate = SimpleDateFormat("dd.MM.yyyy")
        val timestamp = Timestamp(totalBill.dueDate.toLong())
        val date = sampleDate.format(timestamp)
        this.dueDate = date.toString()
    }
}