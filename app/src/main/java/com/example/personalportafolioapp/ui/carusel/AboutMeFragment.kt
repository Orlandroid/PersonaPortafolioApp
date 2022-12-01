package com.example.personalportafolioapp.ui.carusel


import com.example.personalportafolioapp.R
import com.example.personalportafolioapp.databinding.FragmentAbouMeBinding
import com.example.personalportafolioapp.ui.base.BaseFragment


class AboutMeFragment : BaseFragment<FragmentAbouMeBinding>(R.layout.fragment_abou_me) {


    override fun setUpUi() {
        binding.apply {
            imageHello.setAnimation(R.raw.indicius_sticker_helloworld)
        }
    }

}