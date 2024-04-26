package com.example.viewpagerandrecyclerview.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpagerandrecyclerview.data.SampleItemModel
import com.example.viewpagerandrecyclerview.databinding.ItemSampleBinding

class SampleItemAdapter :
    ListAdapter<SampleItemModel, SampleItemAdapter.ViewHolder>(SampleItemDiffUtil()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemSampleBinding.inflate(layoutInflater)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class ViewHolder(
        private val binding: ItemSampleBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: SampleItemModel?) {
            binding.textViewTitle.text = item?.title.orEmpty()
            binding.textViewDescription.text = item?.description.orEmpty()
        }

    }
}