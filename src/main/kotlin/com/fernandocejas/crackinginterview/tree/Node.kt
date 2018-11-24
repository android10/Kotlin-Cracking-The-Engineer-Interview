package com.fernandocejas.crackinginterview.tree

class Node<T>(val data: T) {
    private var leftChild: Node<T>? = null
    private var rightChild: Node<T>? = null

    fun left(data: T) {
        val newNode = Node(data)
        when (leftChild == null) {
            true -> leftChild = newNode
            else -> {
                newNode.leftChild = leftChild
                leftChild = newNode
            }
        }
    }

    fun right(data: T) {
        val newNode = Node(data)
        when (rightChild == null) {
            true -> rightChild = newNode
            else -> {
                newNode.rightChild = rightChild
                rightChild = newNode
            }
        }
    }
}

