package com.example.personalportafolioapp.ui.carusel

import android.os.Bundle
import android.view.View
import com.example.personalportafolioapp.R
import com.example.personalportafolioapp.databinding.FragmentViewPagerBinding
import com.example.personalportafolioapp.ui.base.BaseFragment


class ViewPagerFragment :
    BaseFragment<FragmentViewPagerBinding>(R.layout.fragment_view_pager) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpUi()
    }

    override fun setUpUi() {
        with(binding) {
            viewPager.adapter = PageAdapter(this@ViewPagerFragment)
        }
    }

}