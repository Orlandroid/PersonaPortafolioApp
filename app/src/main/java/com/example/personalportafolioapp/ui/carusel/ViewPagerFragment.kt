package com.example.personalportafolioapp.ui.carusel

import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.personalportafolioapp.R
import com.example.personalportafolioapp.databinding.FragmentViewPagerBinding
import com.example.personalportafolioapp.ui.base.BaseFragment
import com.example.personalportafolioapp.ui.extension.click


class ViewPagerFragment :
    BaseFragment<FragmentViewPagerBinding>(R.layout.fragment_view_pager) {

    override fun setUpUi() {
        with(binding) {
            viewPager.adapter = PageAdapter(this@ViewPagerFragment)
            viewPager.isUserInputEnabled = false
            buttonNext.setOnClickListener {
                goToNextStep()
            }
            toolbarLayout.toolbarBack.click {
                when (viewPager.currentItem) {
                    0 -> {
                        requireActivity().finish()
                    }
                    1 -> {
                        viewPager.currentItem = 0
                    }
                    2 -> {
                        viewPager.currentItem = 1
                    }
                }
            }
        }
    }


    private fun goToNextStep() {
        with(binding) {
            when (viewPager.currentItem) {
                0 -> {
                    viewPager.currentItem = 1
                }
                1 -> {
                    viewPager.currentItem = 2
                }
            }
        }
    }


}
