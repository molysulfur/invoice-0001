package com.example.molys.dynamicrecyclerview.model

import com.google.gson.annotations.SerializedName

data class MockInvoice(
      @SerializedName("bill_to") var billTo : Bill,
      @SerializedName("invoice_items") var invoiceItems : ArrayList<InvoiceItem>,
      @SerializedName("total") var total : TotalBill
)