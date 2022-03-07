package dataStructures.queue

interface IQueue<T> {
    val count: Int

    val isEmpty: Boolean

    fun peek(): T?

    fun enqueue(element: T): Boolean

    fun dequeue(): T?
}