package com.sam.cheezycodemvvmdemo.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainViewModelFactory(val counter : Int) : ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return mainViewModel(counter) as T
    }
}