package com.kakaboc.chinesetrainer

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.kakaboc.chinesetrainer.databinding.CardChoiceFragmentBinding

class CardChoiceFragment : Fragment(R.layout.card_choice_fragment) {

    private lateinit var views: CardChoiceFragmentBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        views = CardChoiceFragmentBinding.bind(view)
    }
}
