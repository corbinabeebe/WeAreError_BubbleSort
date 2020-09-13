package com.example.weareerror_bubblesort

class SortingAlgorithms {

    fun BubbleSort(userArray: IntArray) {
        var swapCount:Int

        do {
            swapCount = SortArray(userArray)
        }while (swapCount > 0)
    }

    fun SortArray(sortArray: IntArray):Int{
        var swapCount = 0

        for (i in (sortArray.size - 1) downTo 1){
            if (sortArray[i] < sortArray[i - 1] ){
                val lowerValue = sortArray[i]
                val higherValue = sortArray[i - 1]

                sortArray[i] = higherValue
                sortArray[i - 1] = lowerValue

                swapCount++
            }
        }

        return swapCount
    }

}