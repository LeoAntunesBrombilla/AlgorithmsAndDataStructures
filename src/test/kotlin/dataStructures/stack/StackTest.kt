package dataStructures.stack

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class StackTest {

    @DisplayName("Should add an element at the top of the stack")
    @Test
    fun pushMethodTest() {
        val stack = Stack<Int>()

        stack.push(5)

        assertEquals(stack.count, 1)
        assertEquals(stack.peek(), 5)
    }

    @DisplayName("Should pop an element at the top of the stack")
    @Test
    fun popMethodTest() {
        val stack = Stack<Int>()

        stack.push(5)
        stack.push(7)
        stack.pop()

        assertEquals(stack.count, 1)
        assertEquals(stack.peek(), 5)
    }
}