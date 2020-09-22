package com.example.weareerror_bubblesort

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sort.*

//used to validate that all digits entered are numbers
val validNumbers: IntArray = intArrayOf(0,1,2,3,4,5,6,7,8,9)

class SortActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sort)

        //on-click listener for the sort button.
        sortArrayButton.setOnClickListener {

        }
    }
}