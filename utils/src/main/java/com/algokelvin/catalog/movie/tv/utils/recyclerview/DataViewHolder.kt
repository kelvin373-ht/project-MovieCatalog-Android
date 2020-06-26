package com.algokelvin.catalog.movie.tv.utils.recyclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class DataViewHolder(view: View): RecyclerView.ViewHolder(view) {
    fun setItemListData(setup: Binding<*>.() -> Unit, item: Any?) = itemView.run {
        val setupData = Binding(this, item)
        setup(setupData)
    }
}