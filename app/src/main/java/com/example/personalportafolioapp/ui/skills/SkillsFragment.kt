package com.example.personalportafolioapp.ui.skills


import android.os.Bundle
import android.view.View
import com.example.personalportafolioapp.R
import com.example.personalportafolioapp.databinding.FragmentSkillsBinding
import com.example.personalportafolioapp.ui.base.BaseFragment

class SkillsFragment : BaseFragment<FragmentSkillsBinding>(R.layout.fragment_skills) {

    //shif+f6
    private val skillsAdapter by lazy {
        SkillsAdapter()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpUi()
    }

    override fun setUpUi() {
        with(binding) {
            recycler.adapter = skillsAdapter
            skillsAdapter.setData(getSkil())
        }
    }

    private fun getSkil():ArrayList<String>{
        val listOfSkill = ArrayList<String>()
        listOfSkill.add("Java")
        listOfSkill.add("Koltin")
        listOfSkill.add("Git")
        listOfSkill.add("Material Design")
        listOfSkill.add("Dagger Hilt")
        listOfSkill.add("Retrofi")
        listOfSkill.add("Room")
        listOfSkill.add("MVVM")
        listOfSkill.add("DataBinding,ViewBinding")
        return listOfSkill
    }
}