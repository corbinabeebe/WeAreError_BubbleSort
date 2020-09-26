package com.example.weareerror_bubblesort


import android.content.Context
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sort.*

//used to validate that all digits entered are numbers
val validNumbers = setOf("0","1","2","3","4","5","6","7","8","9")

//function used in this context to create a toast notification
fun Context.toast(message: CharSequence) = Toast.makeText(this, message, Toast.LENGTH_LONG).show()

class SortActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sort)

        //on-click listener for the sort button.
        sortArrayButton.setOnClickListener {

            //collect user input
            var errors = ""
            val userInput = userEntryTextInput.text
            val inputLength = userInput?.length

            //validate if the user entered the correct amount of digits
            if (userInput == null  || userInput.isEmpty()) {
               errors += "\nYou did not enter any digits"
            } else if (inputLength!! > 0 && inputLength < 3) {
                errors += "\nEnter at least 3 digits"
            } else if(inputLength > 8) {
                errors += "\nEnter no more than 8 digits"
            }

            //validate if all characters in user input are in validNumbers
            // if characters are not in validNumbers, toast to screen and have user re-enter number
            for (i in 0 until inputLength!!) {
                if (!validNumbers.contains(userInput[i].toString())) {
                    errors += "\nUse only digits 0 through 9"
                    break
                }
            }

            //if errors is empty, perform bubble sort and set sortedTextView with result
            if (errors.isEmpty()) {

                // TODO: 9/23/2020 perform bubble sort and add result to sortedTextView
                val bubble = BubbleSort()
                var result = ""
                val userArray = bubble.stringToIntArray(userInput.toString())

                result = bubble.sort(userArray)

                sortedTextView.text = result
            }
            //set toast with errors
            else {
                toast("Please change the following errors: \n$errors")
            }

        }
    }
}