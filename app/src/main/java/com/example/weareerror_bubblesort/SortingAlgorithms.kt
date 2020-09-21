package com.example.weareerror_bubblesort

fun bubbleSortArray (inputArray: IntArray): String{
    val bubbleSort = BubbleSort()

    return bubbleSort.sort(inputArray)
}

class BubbleSort {
    // Output a string with one line for each sort iteration.
    fun sort(arrayToSort: IntArray): String{
        var sortOutput = arrayToSort.joinToString(" ")

//      Continue sorting until there are no swaps.
        while (bubbleDown(arrayToSort)){
            sortOutput += "\n" + arrayToSort.joinToString(separator = " ")
        }

        return sortOutput
    }

    private fun bubbleDown(arrayToSort: IntArray): Boolean{
        var swappedValues = false
        var lowerValue: Int
        var higherValue: Int

//      Starting at the back of array swap adjacent values if the value on the right is less than the value on the left.
//      Note: to optimize this you would decrement the starting position by one on each call.
        for (i in (arrayToSort.size - 1) downTo 1){
            if (arrayToSort[i] < arrayToSort[i - 1] ){
                lowerValue = arrayToSort[i]
                higherValue = arrayToSort[i - 1]

                arrayToSort[i] = higherValue
                arrayToSort[i - 1] = lowerValue

                swappedValues = true
            }
        }

        return swappedValues
    }

    fun bubbleSort(intArrayOf: IntArray) {

    }
}