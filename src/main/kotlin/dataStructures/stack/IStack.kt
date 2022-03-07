package dataStructures.stack

interface IStack<T> {
    val count: Int

    val isEmpty: Boolean

    fun peek(): T?

    fun push(element: T)

    fun pop(): T?
}