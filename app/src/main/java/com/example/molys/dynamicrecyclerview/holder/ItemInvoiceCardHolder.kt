package com.example.molys.dynamicrecyclerview.holder

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.molys.dynamicrecyclerview.R
import com.example.molys.dynamicrecyclerview.item.InvoiceBottomCardItem
import com.example.molys.dynamicrecyclerview.item.InvoiceMiddleCardItem
import com.example.molys.dynamicrecyclerview.item.InvoiceTopCardItem

class ItemInvoiceCardHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var imageCardIcon : ImageView = itemView.findViewById(R.id.img_card_icon)
    var tvCardTitle : TextView = itemView.findViewById(R.id.tv_card_title)
    var tvCardDescription : TextView = itemView.findViewById(R.id.tv_card_description)
    var tvCardPrice : TextView = itemView.findViewById(R.id.tv_card_price)
    var tvCardTax : TextView = itemView.findViewById(R.id.tv_card_tax)

    fun onBindTop(invoiceTopCardItem: InvoiceTopCardItem){
        /*
            Find Tax Price
         */
        val totalPrice = invoiceTopCardItem.cardPrice.toFloat()
        val tax = invoiceTopCardItem.cardTax.toFloat()/100
        var taxPrice = 0.0

        taxPrice = (totalPrice / (1/tax + 1)).toDouble()

        Glide.with(itemView).load(invoiceTopCardItem.cardIcon).into(imageCardIcon)
        tvCardTitle.text = invoiceTopCardItem.cardTitle
        tvCardDescription.text = invoiceTopCardItem.cardDescription
        tvCardPrice.text = "$${String.format("%.2f",invoiceTopCardItem.cardPrice.toFloat())}"
        tvCardTax.text = "Tax " + invoiceTopCardItem.cardTax + "% {$${taxPrice}}"
    }

    fun onBindMiddle(invoiceMiddleCardItem: InvoiceMiddleCardItem){
        val totalPrice = invoiceMiddleCardItem.cardPrice.toFloat()
        val tax = invoiceMiddleCardItem.cardTax.toFloat()/100
        var taxPrice = 0.0

        taxPrice = (totalPrice / (1/tax + 1)).toDouble()

        Glide.with(itemView).load(invoiceMiddleCardItem.cardIcon).into(imageCardIcon)
        tvCardTitle.text = invoiceMiddleCardItem.cardTitle
        tvCardDescription.text = invoiceMiddleCardItem.cardDescription
        tvCardPrice.text = "$${String.format("%.2f",invoiceMiddleCardItem.cardPrice.toFloat())}"
        tvCardTax.text = "Tax " + invoiceMiddleCardItem.cardTax + "% {$${taxPrice}}"
    }

    fun onBindBottom(invoiceBottomCardItem: InvoiceBottomCardItem){
        val totalPrice = invoiceBottomCardItem.cardPrice.toFloat()
        val tax = invoiceBottomCardItem.cardTax.toFloat()/100
        var taxPrice = 0.0

        taxPrice = (totalPrice / (1/tax + 1)).toDouble()
        Glide.with(itemView).load(invoiceBottomCardItem.cardIcon).into(imageCardIcon)
        tvCardTitle.text = invoiceBottomCardItem.cardTitle
        tvCardDescription.text = invoiceBottomCardItem.cardDescription
        tvCardPrice.text = "$${String.format("%.2f",invoiceBottomCardItem.cardPrice.toFloat())}"
        tvCardTax.text = "Tax " + invoiceBottomCardItem.cardTax + "% {$${taxPrice}}"
    }
}