package com.fernandocejas.crackinginterview.list

class LinkedList<T> {

    private var numberOfElements = 0
    private var head: Node? = null

    fun add(element: T) {
        numberOfElements++
        TODO()
    }

    fun add(element: T, position: Int): Unit = TODO()

    fun remove(position: Int): Unit = TODO()

    fun get(position: Int): T = TODO()

    fun size(): Int = numberOfElements

    fun isEmpty() = numberOfElements == 0

    private inner class Node(val data: T) {
        fun next(): Node? = null
    }
}
