package com.example.molys.dynamicrecyclerview.item

import com.example.molys.dynamicrecyclerview.InvoiceCreator
import com.example.molys.dynamicrecyclerview.model.InvoiceItem

class InvoiceMiddleCardItem : BaseItem {
    var cardIcon : String = ""
    var cardTitle : String = ""
    var cardDescription : String = ""
    var cardPrice : String = ""
    var cardTax : String = ""

    constructor(invoiceItem: InvoiceItem) : super(InvoiceCreator.TYPE_INVOICEMIDDLE) {
        cardIcon = invoiceItem.icon
        cardTitle = invoiceItem.title
        cardDescription = invoiceItem.desc
        cardPrice = invoiceItem.totalPrice
        cardTax = invoiceItem.tax
    }
}