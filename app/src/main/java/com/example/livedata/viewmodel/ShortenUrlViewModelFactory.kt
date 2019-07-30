package com.example.livedata.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.livedata.model.Repository

/**
 * ViewModel은 ViewModelProvider에게 해당 객체를 생성할 수 있는 방법을 제공해야 함
 */
@Suppress("UNCHECKED_CAST")
class ShortenUrlViewModelFactory(private val repository: Repository): ViewModelProvider.Factory {
    override fun <T: ViewModel?> create(modelClass: Class<T>): T {
        return ShortenUrlViewModelFactory(repository) as T
    }

}