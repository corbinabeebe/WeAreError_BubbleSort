package com.example.weareerror_bubblesort

import org.junit.Test

import org.junit.Assert.*

val bubbleSort = BubbleSort()

class SortingAlgorithmsTest {
    @Test
    fun validate_bubble_sort (){
        var inputValues = intArrayOf(9, 8, 3, 2, 4, 6)
        var expectedResult = "9 8 3 2 4 6\n" +
                "2 9 8 3 4 6\n" +
                "2 3 9 8 4 6\n" +
                "2 3 4 9 8 6\n" +
                "2 3 4 6 9 8\n" +
                "2 3 4 6 8 9"
        bubble_sort_valid(inputValues, expectedResult)

        inputValues = intArrayOf(1, 2, 3, 4, 5)
        expectedResult = "1 2 3 4 5"
        bubble_sort_valid(inputValues, expectedResult)

        inputValues = intArrayOf(7, 9, 8, 1, 0)
        expectedResult = "7 9 8 1 0\n" +
                "0 7 9 8 1\n" +
                "0 1 7 9 8\n" +
                "0 1 7 8 9"
        bubble_sort_valid(inputValues, expectedResult)

    }

    private fun bubble_sort_valid(inputArray: IntArray, expectedIterations :String) {

        var iterations = bubbleSort.sort(inputArray)
        println(iterations)
        println()

        assertEquals(expectedIterations, iterations)
    }

}