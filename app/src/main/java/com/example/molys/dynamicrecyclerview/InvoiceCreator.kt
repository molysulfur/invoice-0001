package com.example.molys.dynamicrecyclerview

import com.example.molys.dynamicrecyclerview.item.*
import com.example.molys.dynamicrecyclerview.model.MockInvoice

class InvoiceCreator {

    companion object {
        const val TYPE_TITLE = 1
        const val TYPE_BILLTO = 2
        const val TYPE_INVOICETOP = 3
        const val TYPE_INVOICEMIDDLE = 4
        const val TYPE_INVOICEBOTTOM = 5
        const val TYPE_DIVIDER = 6
        const val TYPE_EMTPY = 7
        const val TYPE_TOTAL = 8

        fun toBaseItem(mockInvoice: MockInvoice) : List<BaseItem>{
            val listItem = ArrayList<BaseItem>()

            listItem.add(TitleItem().setTitle("BILL TO"))
            mockInvoice.billTo.let {
                listItem.add(BillCardItem(it))
            }
            listItem.add(TitleItem().setTitle("INVOICE ITEMS"))
            for (invoiceItem in 0 until mockInvoice.invoiceItems.size) {
                when(invoiceItem){
                    0 -> {
                        mockInvoice.invoiceItems[invoiceItem].let {
                            listItem.add(InvoiceTopCardItem(it))
                        }
                        listItem.add(DividerItem())
                    }
                    mockInvoice.invoiceItems.size-1 -> {
                        mockInvoice.invoiceItems[invoiceItem].let {
                            listItem.add(InvoiceBottomCardItem(it))
                        }
                    }
                    else -> {
                        mockInvoice.invoiceItems[invoiceItem].let {
                            listItem.add(InvoiceMiddleCardItem(it))
                        }
                        listItem.add(DividerItem())
                    }
                }
            }
            listItem.add(EmptyItem())
            listItem.add(TitleItem().setTitle("TOTAL"))
            mockInvoice.total.let {
                listItem.add(TotalBillItem(it))
            }
            return listItem
        }

    }


}