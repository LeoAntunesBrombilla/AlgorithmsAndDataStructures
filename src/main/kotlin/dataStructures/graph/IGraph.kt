package dataStructures.graph

interface IGraph {
    fun addVertex(label: String)

    fun removeVertex(label: String)

    fun addEdge(label1: String, label2: String)

    fun removeEdge(label1: String, label2: String)
}