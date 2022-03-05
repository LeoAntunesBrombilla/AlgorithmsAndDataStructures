package algorithms

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class BinarySearchKtTest {
    @DisplayName("Should return the index of the value that we want")
    @Test
    fun binarySearchMethodTest() {
        val binarySearch = BinarySearch()
        val testedArray = arrayOf(1,2,3,4,5,6)

        val result = binarySearch.binarySearchMethod(testedArray, 3)

        assertEquals(result, 2)
    }

    @DisplayName("Should return null if the value that at the want is not on the array")
    @Test
    fun binarySearchNullMethodTest() {
        val binarySearch = BinarySearch()
        val testedArray = arrayOf(1,2,3,4,5,6)

        val result = binarySearch.binarySearchMethod(testedArray, 8)

        assertEquals(result, null)
    }


}