package com.example.projetkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.projetkotlin.databinding.ActivityHomeBinding
import com.example.projetkotlin.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var email: String

    companion object {

        const val EMAIL = "email"


    }


    private var _binding: FragmentHomeBinding?=null

    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            email = it.getString(EMAIL).toString()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.centerText.text = email
        val view = binding.root

        binding.centerText.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToGameFragment()
            view.findNavController().navigate(action)
        }

        return view
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }



}


