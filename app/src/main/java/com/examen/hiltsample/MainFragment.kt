package com.examen.hiltsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.examen.hiltsample.databinding.FragmentMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainFragment : Fragment() {
    lateinit var binding: FragmentMainBinding
    // field injection
    @Inject
    lateinit var fragmentRepository: FragmentRepository
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        callFieldInjection()
        return binding.root
        //return inflater.inflate(R.layout.fragment_main, container, false)
    }

    fun callFieldInjection(){
        fragmentRepository.sendMessage("sainath","Hi Hello")
    }
}