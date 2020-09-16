package com.example.weareerror_bubblesort

import android.nfc.FormatException

class Validations {

    fun greaterThanTwo(input: String) {
        require(input.length > 2) {
            "input should be greater than two and less than 9 digits in length"
        }
    }

    fun lessThanNine(input: String) {
        require(input.length < 9) {
            "input should be less than or equal to eight digits in length"
        }
    }

    fun nonIntegers(input: String) {
        try {
            input.toInt()
        }
        catch (e: FormatException) {
            require(false) {
                "Only numbers accepted"
            }
        }

    }


}