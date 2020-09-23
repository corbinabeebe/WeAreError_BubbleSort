package com.example.weareerror_bubblesort

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_welcome.*

//var userEntryTextView
//var sortedTextView
//var userArray: IntArray

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        //onclick listener that grabs the intent and starts the sorting activity
        //used to move from the welcome page to the sort page
        getStartedButton.setOnClickListener {
            val sortIntent = Intent(this, SortActivity:: class.java)
            startActivity(sortIntent)
        }
    }

}