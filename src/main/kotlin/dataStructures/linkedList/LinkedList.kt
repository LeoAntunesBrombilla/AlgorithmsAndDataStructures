package dataStructures.linkedList

class LinkedList<T> {
    var head: Node<T>? = null
    var tail: Node<T>? = null
    var size = 0

    fun isEmpty(): Boolean {
        return size == 0
    }

    override fun toString(): String {
        return if (isEmpty()) {
            "List has no nodes"
        } else {
            head.toString()
        }
    }

    fun nodeAt(index: Int): Node<T>? {
        if (index < 0 || index >= size) {
            return null
        }
        var temp = head
        var counter = 0
        while(counter < index) {
            temp = temp?.next
            counter++
        }
        return temp
    }

    fun push(value: T) {
        val newNode = Node(value = value)
        if (head == null) {
            head = newNode
            tail = newNode
        } else {
            newNode.next = head
            head = newNode
        }
        size++
    }

    fun append(value: T) {
        if (isEmpty()) push(value = value)

        tail?.next = Node(value = value, null)
        tail = tail?.next
        size++
    }

    fun insertAt(index: Int, value: T) {
        if(index == 0) push(value = value)
        if(index == size) append(value = value)

        val node = Node(value = value)
        val temporary = nodeAt(index - 1)

        node.next = temporary?.next
        temporary?.next = node

        size++
    }

    fun removeFirst(): T? {
        val removedValue = head?.value
        head = head?.next

        if(isEmpty()) {
            tail = null
        }

        size--
        return removedValue
    }

    fun removeLast(): T? {

        if (isEmpty()) return null

        val head = head ?: return null

        if(head.next == null) {
            return removeFirst()
        }

        var prev = head
        var current = head
        var next = head.next

        while (next != null) {
            prev = current
            current = next
            next = current.next
        }

        prev.next = null
        tail = prev
        size --
        return current.value

    }

    fun removeAfter(index: Int): Node<T>? {
        if(index == 0) removeFirst()
        if(index == size) removeLast()

        val previous = nodeAt(index - 1)
        val temporary = previous?.next

        previous?.next = temporary?.next
        temporary?.next = null
        size--
        return temporary
    }


}