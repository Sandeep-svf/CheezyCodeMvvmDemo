package com.sam.cheezycodemvvmdemo.viewModel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.sam.cheezycodemvvmdemo.R

class MainActivity : AppCompatActivity() {

    lateinit var textCounter : TextView
    lateinit var mainViewModel : mainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this, MainViewModelFactory(10))
            .get(com.sam.cheezycodemvvmdemo.viewModel.mainViewModel::class.java)

        textCounter = findViewById(R.id.text_count)
        setText()
    }

    private fun setText() {
        textCounter.text = mainViewModel.count.toString()
    }

    fun increment(v : View){
        mainViewModel.increment()
        setText()
    }
}