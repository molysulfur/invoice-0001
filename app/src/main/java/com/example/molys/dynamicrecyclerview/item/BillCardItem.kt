package com.example.molys.dynamicrecyclerview.item

import com.example.molys.dynamicrecyclerview.InvoiceCreator
import com.example.molys.dynamicrecyclerview.model.Bill

class BillCardItem : BaseItem {
    var cardIcon : String? = ""
    fun setCardIcon(cardIcon : String): BillCardItem {
        this.cardIcon= cardIcon
        return this
    }

    var cardTitle : String? = ""
    fun setCardTitle(cardTitle : String): BillCardItem {
        this.cardTitle = cardTitle
        return this
    }

    var cardLocation : String? = ""
    fun setCardLocation(cardLocation : String): BillCardItem {
        this.cardLocation = cardLocation
        return this
    }

    constructor(bill : Bill?) : super(InvoiceCreator.TYPE_BILLTO) {
        cardIcon = bill?.icon
        cardTitle = bill?.companyName
        cardLocation = bill?.address
    }

}