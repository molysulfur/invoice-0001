package com.example.molys.dynamicrecyclerview.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.molys.dynamicrecyclerview.InvoiceCreator
import com.example.molys.dynamicrecyclerview.R
import com.example.molys.dynamicrecyclerview.holder.*
import com.example.molys.dynamicrecyclerview.item.*

class InvoiceAdapter(val listItem : ArrayList<BaseItem>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType : Int): RecyclerView.ViewHolder {
        when(viewType){
            InvoiceCreator.TYPE_TITLE -> {
                val title = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_title,viewGroup,false)
                return ItemTitleHolder(title)
            }
            InvoiceCreator.TYPE_BILLTO -> {
                val billTo = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_bill_card,viewGroup,false)
                return ItemBillCardHolder(billTo)
            }
            InvoiceCreator.TYPE_INVOICETOP -> {
                val invoiceTop = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_invoice_top_card,viewGroup,false)
                return ItemInvoiceCardHolder(invoiceTop)
            }
            InvoiceCreator.TYPE_INVOICEMIDDLE -> {
                val invoiceMiddle = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_invoice_middle_card,viewGroup,false)
                return ItemInvoiceCardHolder(invoiceMiddle)
            }
            InvoiceCreator.TYPE_INVOICEBOTTOM -> {
                val invoiceBottom = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_invoice_bottom_card,viewGroup,false)
                return ItemInvoiceCardHolder(invoiceBottom)
            }
            InvoiceCreator.TYPE_EMTPY -> {
                val emptyItem = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_empty,viewGroup,false)
                return ItemEmptyHolder(emptyItem)
            }
            InvoiceCreator.TYPE_TOTAL -> {
                val totalBillItem = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_total_bill,viewGroup,false)
                return ItemTotalBillHolder(totalBillItem)
            }
            InvoiceCreator.TYPE_DIVIDER -> {
                val divider = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_divider,viewGroup,false)
                return ItemDividerHolder(divider)
            }
            else -> return super.createViewHolder(viewGroup,viewType)
        }

    }

    override fun getItemCount(): Int = listItem.size

    override fun getItemViewType(position: Int): Int {
        return listItem[position].type
    }

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
        when{
            getItemViewType(position) == InvoiceCreator.TYPE_TITLE -> {
                val titleHolder = viewHolder as ItemTitleHolder
                titleHolder.onBind(listItem[position] as TitleItem)
            }
            getItemViewType(position) == InvoiceCreator.TYPE_BILLTO -> {
                val billCardHolder = viewHolder as ItemBillCardHolder
                billCardHolder.onBind(listItem[position] as BillCardItem)
            }
            getItemViewType(position) == InvoiceCreator.TYPE_INVOICETOP -> {
                val invoiceTopHolder = viewHolder as ItemInvoiceCardHolder
                invoiceTopHolder.onBindTop(listItem[position] as InvoiceTopCardItem)
            }
            getItemViewType(position) == InvoiceCreator.TYPE_INVOICEMIDDLE -> {
                val invoiceMiddleHolder = viewHolder as ItemInvoiceCardHolder
                invoiceMiddleHolder.onBindMiddle(listItem[position] as InvoiceMiddleCardItem)
            }
            getItemViewType(position) == InvoiceCreator.TYPE_INVOICEBOTTOM -> {
                val invoiceBottomHolder = viewHolder as ItemInvoiceCardHolder
                invoiceBottomHolder.onBindBottom(listItem[position] as InvoiceBottomCardItem)
            }
            getItemViewType(position) == InvoiceCreator.TYPE_DIVIDER -> {
                val divierHolder = viewHolder as ItemDividerHolder
            }
            getItemViewType(position) == InvoiceCreator.TYPE_EMTPY -> {
                val emptyHolder = viewHolder as ItemEmptyHolder
            }
            getItemViewType(position) == InvoiceCreator.TYPE_TOTAL -> {
                val totalBillHolder = viewHolder as ItemTotalBillHolder
                totalBillHolder.onBind(listItem[position] as TotalBillItem)
            }

        }
    }

}