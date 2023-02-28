package com.sam.cheezycodemvvmdemo.viewModel

import androidx.lifecycle.ViewModel

class mainViewModel (val initializValue  : Int) : ViewModel() {

    var count : Int = initializValue

    fun increment () {
        count ++
    }

}