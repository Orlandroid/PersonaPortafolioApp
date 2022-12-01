package com.example.personalportafolioapp.ui.carusel

import com.example.personalportafolioapp.R
import com.example.personalportafolioapp.databinding.FragmentBackgroundBinding
import com.example.personalportafolioapp.ui.base.BaseFragment


class BackgroundFragment : BaseFragment<FragmentBackgroundBinding>(R.layout.fragment_background) {


    override fun setUpUi() {
        with(binding) {
            image.setAnimation(R.raw.development)
        }
    }

}