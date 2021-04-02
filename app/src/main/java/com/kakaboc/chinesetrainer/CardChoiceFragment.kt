package com.kakaboc.chinesetrainer

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.kakaboc.chinesetrainer.database.HanziDao
import com.kakaboc.chinesetrainer.databinding.CardChoiceFragmentBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CardChoiceFragment : Fragment(R.layout.card_choice_fragment) {

    private lateinit var views: CardChoiceFragmentBinding
    @Inject
    lateinit var hanziDao: HanziDao


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        views = CardChoiceFragmentBinding.bind(view)
        setupHanziTraining()
    }

    private fun setupHanziTraining() {
        // can change, leaving TODO
        viewLifecycleOwner.lifecycleScope.launch(Dispatchers.IO) {
            hanziDao.getAll().collect {

            }
        }
    }
}
