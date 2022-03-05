package algorithms

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class QuickSortTest {
    @DisplayName("Should orderer a list of integers")
    @Test
    fun quickSortMethodTest() {
        val quickSort = QuickSort()
        val list = listOf(1,5,4,2,7,10,6)

        val result = quickSort.quickSortMethod(list)

        assertEquals(result, listOf(1,2,4,5,6,7,10))

    }
}