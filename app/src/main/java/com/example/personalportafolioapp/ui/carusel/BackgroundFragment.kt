package com.example.personalportafolioapp.ui.carusel

import android.os.Bundle
import android.view.View
import com.example.personalportafolioapp.R
import com.example.personalportafolioapp.databinding.FragmentBackgroundBinding
import com.example.personalportafolioapp.ui.base.BaseFragment


class BackgroundFragment : BaseFragment<FragmentBackgroundBinding>(R.layout.fragment_background) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpUi()
    }

    override fun setUpUi() {

    }

}