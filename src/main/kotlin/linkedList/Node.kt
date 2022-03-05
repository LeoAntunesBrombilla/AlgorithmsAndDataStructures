package linkedList

class Node<T>(var value: T, var next: Node<T>? = null) {
    override fun toString(): String {
        return if (next != null) {
            "{Value: $value, Next: ${next.toString()}}"
        } else {
            "{Value: $value}"
        }
    }
}