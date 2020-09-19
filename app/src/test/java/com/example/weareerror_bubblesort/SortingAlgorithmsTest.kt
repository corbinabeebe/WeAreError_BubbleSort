package com.example.weareerror_bubblesort

import org.junit.Test

import org.junit.Assert.*

val sort = SortingAlgorithms()

class SortingAlgorithmsTest {
    @Test

    fun bubble_sort_valid() {
        assertEquals(arrayListOf(2, 1, 5, 6), sort.bubbleSort(intArrayOf(2, 5, 2, 1, 6)))
    }



}