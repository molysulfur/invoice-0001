package com.example.molys.dynamicrecyclerview.holder

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.example.molys.dynamicrecyclerview.R
import com.example.molys.dynamicrecyclerview.item.TitleItem


class ItemTitleHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var tvTitle : TextView = itemView.findViewById(R.id.tv_title)

    fun onBind(titleItem: TitleItem){
        tvTitle.text = titleItem.title
    }
}