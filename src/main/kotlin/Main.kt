import dataStructures.linkedList.LinkedList

fun main() {
    val list = LinkedList<Int>()

    list.push(1)
    list.append(2)
    list.append(3)
    list.append(4)
    list.append(5)
    list.removeAfter(3)



    println(list)
}