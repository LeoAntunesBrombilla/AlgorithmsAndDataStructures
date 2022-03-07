package dataStructures.linkedList

import dataStructures.linkedList.Node
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class NodeTest {

    internal class NodeTest {
        @Test
        @DisplayName("Should create a node with correct value and next as null")
        fun nodeCreation() {
            val node = Node(value = 2)
            assertEquals(node.value, 2)
            assertEquals(node.next, null)
        }
    }
}