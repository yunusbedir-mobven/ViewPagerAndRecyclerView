package com.example.viewpagerandrecyclerview.ui

import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(
    private val fragmentActivity: FragmentActivity
) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return ViewPagerItemFragment()
    }

    fun getTitle(position: Int): String {
        return when(position) {
            0 -> "Mert"
            1 -> "Furkan"
            2 -> "Yusuf"
            else -> "Arif"
        }
    }

    fun getIcon(position: Int): Drawable? {
        return when(position) {
            0 -> ContextCompat.getDrawable(fragmentActivity, android.R.drawable.ic_delete)
            1 -> ContextCompat.getDrawable(fragmentActivity, androidx.core.R.drawable.ic_call_answer)
            2 -> ContextCompat.getDrawable(fragmentActivity, com.google.android.material.R.drawable.ic_arrow_back_black_24)
            else -> ContextCompat.getDrawable(fragmentActivity, com.google.android.material.R.drawable.ic_arrow_back_black_24)
        }
    }
}