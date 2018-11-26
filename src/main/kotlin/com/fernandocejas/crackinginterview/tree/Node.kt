package com.fernandocejas.crackinginterview.tree

class Node<T>(val data: T) {
    var left: Node<T>? = null
    var right: Node<T>? = null

    fun addLeft(data: T) {
        val newNode = Node(data)
        when (left == null) {
            true -> left = newNode
            else -> {
                newNode.left = left
                left = newNode
            }
        }
    }

    fun addRight(data: T) {
        val newNode = Node(data)
        when (right == null) {
            true -> right = newNode
            else -> {
                newNode.right = right
                right = newNode
            }
        }
    }
}

