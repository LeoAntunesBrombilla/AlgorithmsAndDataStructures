package dataStructures.queue

class Queue<T>: IQueue<T> {
    private val queue = arrayListOf<T>()

    override val count: Int
        get() = queue.size
    override val isEmpty: Boolean
        get() = count == 0

    override fun peek(): T? {
        return if(isEmpty) {
            null
        } else {
            queue.getOrNull(0)
        }
    }

    override fun enqueue(element: T): Boolean {
        return queue.add(element)
    }

    override fun dequeue(): T? {
        return if(isEmpty) {
            null
        } else {
            queue.removeFirst()
        }
    }


}