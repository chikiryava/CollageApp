package com.example.collageapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.collageapp.databinding.ActivityModeSectionBinding
import com.example.collageapp.ui.admin.AdminActivity

class ModeSectionActivity : AppCompatActivity() {
    private lateinit var binding:ActivityModeSectionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityModeSectionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonAdmission.setOnClickListener{
            changeActivity(AdminActivity())
        }
    }
    private fun changeActivity(activity: Activity){
        startActivity(Intent(this,activity::class.java))
    }
}