package com.example.viewpagerandrecyclerview.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewpagerandrecyclerview.data.DataStore
import com.example.viewpagerandrecyclerview.databinding.FragmentViewPagerItemBinding

class ViewPagerItemFragment : Fragment() {

    private lateinit var binding: FragmentViewPagerItemBinding

    private val sampleAdapter = SampleItemAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentViewPagerItemBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
    }

    private fun setupViews() {
        binding.recyclerView.adapter = sampleAdapter
        sampleAdapter.submitList(DataStore.sampleItems)
    }

}