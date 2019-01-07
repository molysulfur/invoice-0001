package com.example.molys.dynamicrecyclerview.item

import com.example.molys.dynamicrecyclerview.InvoiceCreator

class TitleItem : BaseItem(InvoiceCreator.TYPE_TITLE) {
    var title : String = ""

    fun setTitle(title : String): TitleItem {
        this.title = title
        return this
    }
}