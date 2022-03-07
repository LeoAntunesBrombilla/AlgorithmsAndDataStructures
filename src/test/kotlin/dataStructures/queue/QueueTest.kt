package dataStructures.queue

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test


internal class QueueTest {



    @DisplayName("Should add an element at the the beginning of the queue")
    @Test
    fun enqueueMethodTest() {
        val queue = Queue<Int>()
        queue.enqueue(3)

        assertEquals(queue.peek(), 3)
    }


    @DisplayName("Should remove an element at the the beginning of the queue")
    @Test
    fun dequeueMethodTest() {
        val queue = Queue<Int>()
        queue.enqueue(3)
        queue.enqueue(2)
        queue.dequeue()

        assertEquals(queue.peek(), 2)
    }


    @DisplayName("Should return null when queue is empty")
    @Test
    fun dequeueEmptyMethodTest() {
        val queue = Queue<Int>()
        queue.dequeue()

        assertEquals(queue.peek(), null)
    }

}