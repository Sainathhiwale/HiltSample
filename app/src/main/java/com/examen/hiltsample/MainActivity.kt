package com.examen.hiltsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.examen.hiltsample.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    // field injection
    @Inject
    lateinit var loginRepository: LoginRepository
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
         loginRepository.registerUser(101,"sainath","sainath@gmail.com","pass123",9453221212,"pune")
    }
}