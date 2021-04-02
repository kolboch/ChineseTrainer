package com.kakaboc.chinesetrainer.training

import com.kakaboc.chinesetrainer.database.ExerciseContent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow

@ExperimentalCoroutinesApi
class Session(val items: List<ExerciseContent>) {
    private val exerciseContentFlow: Flow<ExerciseContent?> = MutableStateFlow(items[0])

    fun getCurrentExercise(): Flow<ExerciseContent?> = exerciseContentFlow
}
