package dataStructures.stack

class Stack<T> : IStack<T> {

    private val stack = arrayListOf<T>()

    override val count: Int
        get() = stack.size
    override val isEmpty: Boolean
        get() = stack.size == 0

    override fun peek(): T? {
        return stack.getOrNull(0)
    }

    override fun push(element: T) {
        return stack.add(0, element)
    }

    override fun pop(): T? {
        return if (isEmpty) {
            null
        } else {
            stack.removeFirst()
        }
    }

}