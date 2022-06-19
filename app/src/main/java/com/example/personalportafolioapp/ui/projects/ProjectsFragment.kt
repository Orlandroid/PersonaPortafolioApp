package com.example.personalportafolioapp.ui.projects


import android.os.Bundle
import android.view.View
import com.example.personalportafolioapp.R
import com.example.personalportafolioapp.databinding.FragmentProjectsBinding
import com.example.personalportafolioapp.ui.base.BaseFragment

class ProjectsFragment : BaseFragment<FragmentProjectsBinding>(R.layout.fragment_projects) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpUi()
    }

    private fun setUpUi() {
        with(binding) {

        }
    }
}