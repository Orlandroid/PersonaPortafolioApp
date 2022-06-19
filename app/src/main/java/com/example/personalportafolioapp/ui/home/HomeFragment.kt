package com.example.personalportafolioapp.ui.home

import android.os.Bundle
import android.view.View
import com.example.personalportafolioapp.R
import com.example.personalportafolioapp.databinding.FragmentHomeBinding
import com.example.personalportafolioapp.ui.base.BaseFragment


class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpUi()
    }

    private fun setUpUi() {
        with(binding) {
            image.setAnimation(getRandomAnimation())
            rool.tvCart.text=resources.getString(R.string.android_developer)
            nombre.tvCart.text=resources.getString(R.string.nombre)
            aboutMe.tvCart.text=resources.getString(R.string.about_me)
        }
    }

    private fun getRandomAnimation():Int{
        return when((1..3).random()){
            1 -> R.raw.android_logo
            2 -> R.raw.android_studio_new_logo
            else -> R.raw.kotlin_android
        }
    }




}