package com.example.molys.dynamicrecyclerview.holder

import android.annotation.SuppressLint
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.example.molys.dynamicrecyclerview.R
import com.example.molys.dynamicrecyclerview.item.TotalBillItem


class ItemTotalBillHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var tvTotalPrice : TextView = itemView.findViewById(R.id.tv_total_price)
    var tvDate : TextView = itemView.findViewById(R.id.tv_date)

    @SuppressLint("SetTextI18n")
    fun onBind(totalBillItem: TotalBillItem){
        tvTotalPrice.text = "$${totalBillItem.totalPrice}"
        tvDate.text = "due date: ${totalBillItem.dueDate}"
    }
}