package com.example.collageapp.ui.admin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.collageapp.R
import com.example.collageapp.databinding.FragmentGroupsBinding
import com.example.collageapp.databinding.FragmentStudentsBinding

class GroupsFragment : Fragment() {
    private lateinit var binding:FragmentGroupsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentGroupsBinding.inflate(layoutInflater,container,false)
        return binding.root
    }


}