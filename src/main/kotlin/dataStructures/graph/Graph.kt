package dataStructures.graph


class Graph: IGraph {
    private val adjVertices: MutableMap<Vertex, MutableList<Vertex>> = mutableMapOf()

    override fun addVertex(label: String) {
        adjVertices.putIfAbsent(Vertex(label), mutableListOf())
    }

    override fun removeVertex(label: String) {
        val vertex = Vertex(label)

        adjVertices.values.stream().forEach{it -> it.remove(vertex)}
        adjVertices.remove(vertex)
    }

    override fun addEdge(label1: String, label2: String) {
        val vertex1 = Vertex(label1)
        val vertex2 = Vertex(label2)
        adjVertices[vertex1]?.add(vertex2)
    }

    override fun removeEdge(label1: String, label2: String) {
        val vertex1 = Vertex(label1)
        val vertex2 = Vertex(label2)
        val edgeVertex1 = adjVertices[vertex1]
        val edgeVertex2 = adjVertices[vertex2]

        edgeVertex1?.remove(vertex2)
        edgeVertex2?.remove(vertex1)
    }

    override fun toString(): String {
        return "$adjVertices"
    }
}

