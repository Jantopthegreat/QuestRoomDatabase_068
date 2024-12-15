package com.example.pertemuan10.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pertemuan10.Repository.RepositoryMhs
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.filterNotNull

class HomeMhsViewModel ( private val repositoryMhs : RepositoryMhs) : ViewModel() {

    val homeUiState: StateFlow<HomeUiState> = repositoryMhs.getAllMahasiswa()
        .filterNotNull()
        .map {
            HomeUiState(
                listMhs = it.toList(),
                isLoading = false,
            )
        }
        .onStart {
            emit (HomeUiState(isLoading = true))
            delay(900)
        }
        .catch {
            emit(
                HomeUiState(
                    isLoading = false,
                    isError = false,
                    errorMessage = it.message ?: "Terjadi Kesalahan"
                )
            )
        }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = HomeUiState(
                isLoading = true,
            )
        )
}