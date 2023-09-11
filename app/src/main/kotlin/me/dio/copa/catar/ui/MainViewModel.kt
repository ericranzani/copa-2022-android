package me.dio.copa.catar.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import me.dio.copa.catar.domain.model.MatchDomain
import me.dio.copa.catar.domain.usecase.DisableNotificationUseCase
import me.dio.copa.catar.domain.usecase.EnableNotificationUseCase
import me.dio.copa.catar.domain.usecase.GetMatchesUseCase

import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val matchesRepo: GetMatchesUseCase,
    private val disableNotificationUseCase: DisableNotificationUseCase,
    private val enableNotificationUseCase: EnableNotificationUseCase
) : ViewModel() {

    init {
        getAllMatches()
    }

    private val _matchListState = MutableStateFlow(emptyList<MatchDomain>())
    val matchListState : StateFlow<List<MatchDomain>> = _matchListState

    private val _expandedCardIdsList = MutableStateFlow(listOf<String>())
    val expandedCardIdsList: StateFlow<List<String>> get() = _expandedCardIdsList

    fun enableNotificationFor(id: String) = viewModelScope.launch {
        enableNotificationUseCase.invoke(id)
    }

    fun disableNotificationFor(id: String) = viewModelScope.launch{
        disableNotificationUseCase.invoke(id)
    }

    private fun getAllMatches() = viewModelScope.launch {
        runCatching {
            matchesRepo.invoke().collect {
                _matchListState.value = it
            }
        }
    }

    fun onCardArrowClicked(cardId: String) {
        _expandedCardIdsList.value = _expandedCardIdsList.value.toMutableList().also { list ->
            if (list.contains(cardId)) list.remove(cardId) else list.add(cardId)
        }
    }
}