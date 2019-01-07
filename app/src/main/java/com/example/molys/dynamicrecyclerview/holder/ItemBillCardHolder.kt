package com.example.molys.dynamicrecyclerview.holder

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.molys.dynamicrecyclerview.R
import com.example.molys.dynamicrecyclerview.item.BillCardItem

class ItemBillCardHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var imageCardIcon : ImageView = itemView.findViewById(R.id.img_card_icon)
    var tvCardTitle : TextView = itemView.findViewById(R.id.tv_card_title)
    var tvCardLocation : TextView = itemView.findViewById(R.id.tv_card_location)

    fun onBind(billCardItem: BillCardItem){
        Glide.with(itemView).load(billCardItem.cardIcon).into(imageCardIcon)
        tvCardTitle.text = billCardItem.cardTitle
        tvCardLocation.text = billCardItem.cardLocation
    }
}