package com.example.weareerror_bubblesort

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sort.*

//used to validate that all digits entered are numbers
val validNumbers = arrayOf("0","1","2","3","4","5","6","7","8","9")

class SortActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sort)

        //on-click listener for the sort button.
        sortArrayButton.setOnClickListener {

            //collect user input
            var userInput = userEntryTextInput.text

            //validate if all characters in user input are in validNumbers
            //if characters are not in validNumbers, toast to screen and have user re-enter number


        }
    }
}