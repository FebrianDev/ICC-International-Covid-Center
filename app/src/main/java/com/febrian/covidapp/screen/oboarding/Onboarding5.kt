package com.febrian.covidapp.screen.oboarding

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.febrian.covidapp.MainActivity
import com.febrian.covidapp.databinding.FragmentOnboarding5Binding


class Onboarding5 : Fragment() {

    private lateinit var binding : FragmentOnboarding5Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOnboarding5Binding.inflate(
            layoutInflater, container, false
        )

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnStart.setOnClickListener {
            val intent = Intent(view.context, MainActivity::class.java)
            startActivity(intent)
            activity?.finish()
        }
    }
}