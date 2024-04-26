package com.example.viewpagerandrecyclerview.ui

import androidx.recyclerview.widget.DiffUtil
import com.example.viewpagerandrecyclerview.data.SampleItemModel

class SampleItemDiffUtil : DiffUtil.ItemCallback<SampleItemModel>() {
    override fun areItemsTheSame(oldItem: SampleItemModel, newItem: SampleItemModel): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: SampleItemModel, newItem: SampleItemModel): Boolean {
        return oldItem.title == newItem.title
    }
}