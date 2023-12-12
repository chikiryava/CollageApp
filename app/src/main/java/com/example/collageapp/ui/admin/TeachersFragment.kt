package com.example.collageapp.ui.admin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.collageapp.databinding.FragmentTeachersBinding

class TeachersFragment : Fragment() {
    private lateinit var binding:FragmentTeachersBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTeachersBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

}