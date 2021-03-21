package com.kakaboc.chinesetrainer

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.kakaboc.chinesetrainer.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var views: FragmentHomeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        views = FragmentHomeBinding.bind(view)
        views.button.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_cardChoiceFragment)
        }
    }
}
