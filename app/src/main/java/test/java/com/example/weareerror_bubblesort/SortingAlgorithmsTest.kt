package test.java.com.example.weareerror_bubblesort

import com.example.weareerror_bubblesort.SortingAlgorithms

import org.junit.Test

import org.junit.Assert.*

val sort = SortingAlgorithms()

class SortingAlgorithmsTest {
    @Test

    fun bubble_sort_test_more_than_three() {
        assertEquals("array should have at least three elements", sort.BubbleSort(intArrayOf(2, 5)))
    }

    fun bubble_sort_test_less_than_eight() {
        assertEquals("array should have no more than eight elements", sort.BubbleSort(intArrayOf(2, 7, 5, 1, 3, 7, 4, 9)))
    }

}