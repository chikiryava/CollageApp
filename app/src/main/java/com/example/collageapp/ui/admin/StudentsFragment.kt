package com.example.collageapp.ui.admin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.collageapp.R
import com.example.collageapp.databinding.FragmentStudentsBinding

class StudentsFragment : Fragment() {
    private lateinit var binding:FragmentStudentsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStudentsBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

}