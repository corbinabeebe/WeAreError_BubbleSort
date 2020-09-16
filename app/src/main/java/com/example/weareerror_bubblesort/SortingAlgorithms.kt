package com.example.weareerror_bubblesort

class SortingAlgorithms {

    fun bubbleSort(userArray: IntArray): List<String> {
        var userArraySize = userArray.size

        //added user entered array to list
        var sortedList = mutableListOf(userArray.joinToString { it -> it. })

        for(i in 0 until userArraySize - 1) {

            //sorts array with one pass
            bubbleSortSinglePass(userArray)

            //adds newly sorted array to list
            sortedList.add(userArray.joinToString { " " })


        }

        return sortedList
    }

    private fun bubbleSortSinglePass(sortArray: IntArray) {

        for (i in (sortArray.size - 1) downTo 1){
            if (sortArray[i] < sortArray[i - 1] ){
                val lowerValue = sortArray[i]
                val higherValue = sortArray[i - 1]

                sortArray[i] = higherValue
                sortArray[i - 1] = lowerValue
            }
        }
    }

}