package dataStructures.linkedList

import dataStructures.linkedList.LinkedList
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class LinkedListTest {
    @Test
    @DisplayName("Should find the right size of the linked list")
    fun testSize() {
        val list = LinkedList<Int>()

        assertEquals(list.isEmpty(), true)

    }


    @Test
    @DisplayName("Should add an element at the beginning of the array")
    fun pushMethodTest() {
        val list = LinkedList<Int>()
        list.push(3)
        list.push(2)

        assertEquals(list.head?.value, 2)
        assertEquals(list.tail?.value, 3)
    }

    @Test
    @DisplayName("Should add an element at the end of a empty list")
    fun appendMethodTestEmptyList() {
        val list = LinkedList<Int>()
        list.append(3)

        assertEquals(list.tail?.value, 3)
        assertEquals(list.head?.value, 3)
    }

    @Test
    @DisplayName("Should add an element at the end of a list")
    fun appendMethodTest() {
        val list = LinkedList<Int>()
        list.push(2)
        list.append(3)

        assertEquals(list.tail?.value, 3)
        assertEquals(list.head?.value, 2)
    }

    @Test
    @DisplayName("Should return the node at the specified index")
    fun nodeAtMethodTest() {
        val list = LinkedList<Int>()
        list.push(1)

        val node = list.nodeAt(3)
        assertEquals(node?.value, null)
    }

    @Test
    @DisplayName("Should add an element at a specific location of the list")
    fun insertAtMethodTest() {
        val list = LinkedList<Int>()
        list.append(1)
        list.append(2)
        list.append(3)

        list.append(4)
        list.append(5)

        list.insertAt(3, 10)

        val node = list.nodeAt(3)
        assertEquals(node?.value, 10)
        assertEquals(node?.next?.value, 3)
    }

    @Test
    @DisplayName("Should delete the first element at the linkedList")
    fun removeFirstMethodTest() {
        val list = LinkedList<Int>()
        list.push(1)
        list.append(2)

        list.removeFirst()

        assertEquals(list.head?.value, 2)
    }

    @Test
    @DisplayName("Should make tail = null if linkedList is Empty")
    fun removeFirstIsEmptyMethodTest() {
        val list = LinkedList<Int>()


        list.removeFirst()

        assertEquals(list.head?.value, null)
    }

    @Test
    @DisplayName("Should delete the last element at the linkedList")
    fun removeLastMethodTest() {
        val list = LinkedList<Int>()
        list.push(1)
        list.append(4)
        list.append(2)

        list.removeLast()

        assertEquals(list.tail?.value, 4)
        assertEquals(list.size, 2)
    }

    @Test
    @DisplayName("Should delete the last element at the linkedList if the linked list has one element")
    fun removeLastOnlyOneElementMethodTest() {
        val list = LinkedList<Int>()
        list.push(1)

        list.removeLast()

        assertEquals(list.size, 0)
    }


    @Test
    @DisplayName("Should delete an element at a specific location on the linkedList")
    fun removeAfterMethodTest() {
        val list = LinkedList<Int>()
        list.append(1)
        list.append(2)
        list.append(3)
        list.append(4)
        list.append(5)

        list.removeAfter(3)
        val result = list.nodeAt(4)

        assertEquals(result?.value, 5)
    }
}