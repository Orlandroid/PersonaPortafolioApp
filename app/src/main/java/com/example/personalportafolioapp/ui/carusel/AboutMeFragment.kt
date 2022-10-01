package com.example.personalportafolioapp.ui.carusel


import android.os.Bundle
import android.view.View
import com.example.personalportafolioapp.R
import com.example.personalportafolioapp.databinding.FragmentAbouMeBinding
import com.example.personalportafolioapp.ui.base.BaseFragment


class AboutMeFragment : BaseFragment<FragmentAbouMeBinding>(R.layout.fragment_abou_me) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpUi()
    }

    override fun setUpUi() {

    }

}