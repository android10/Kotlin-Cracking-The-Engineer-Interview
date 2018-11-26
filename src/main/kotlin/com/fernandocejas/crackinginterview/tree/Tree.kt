package com.fernandocejas.crackinginterview.tree

class Tree {

    fun createBasicTree(): Node<Int> {
        val nodeTwo = Node(2)
        nodeTwo.left = Node(3)
        nodeTwo.right = Node(4)

        val nodeFive = Node(5)
        nodeFive.left = Node(6)
        nodeFive.right = Node(7)

        val nodeHead = Node(1)
        nodeHead.left = nodeTwo
        nodeHead.right = nodeFive

        return nodeHead
    }
}