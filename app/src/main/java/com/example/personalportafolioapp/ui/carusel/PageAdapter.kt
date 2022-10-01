package com.example.personalportafolioapp.ui.carusel


import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class PageAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> AboutMeFragment()
            1 -> BackgroundFragment()
            else -> WhoIAmFragment()
        }
    }

}