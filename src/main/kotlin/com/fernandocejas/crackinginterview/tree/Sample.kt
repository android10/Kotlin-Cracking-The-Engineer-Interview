package com.fernandocejas.crackinginterview.tree

class Sample {

    /**
     * Create the following tree structure:
     *
     *      3
     *     / \
     *    9  20
     *      /  \
     *     15  7
     */
    fun createBasicTree(): Node<Int> {

        val nineNode = Node(9)
        val fifteenNode = Node(15)
        val sevenNode = Node(7)

        val twentyNode = Node(20)
        twentyNode.left = fifteenNode
        twentyNode.right = sevenNode

        val rootNode = Node(3)
        rootNode.left = nineNode
        rootNode.right = twentyNode

        return rootNode
    }

    /**
     * Create the following BST structure:
     *
     *      2
     *     / \
     *    1  3
     */
    fun createBasicBST(): Node<Int> {
        val rootNode = Node(2)
        rootNode.left = Node(1)
        rootNode.right = Node(3)

        return rootNode
    }

    /**
     * Create the following tree structure:
     *
     *      5
     *     / \
     *    1  4
     *      / \
     *     3  6
     */
    fun createNoBST(): Node<Int> {

        val nineNode = Node(9)
        val fifteenNode = Node(15)
        val sevenNode = Node(7)

        val twentyNode = Node(20)
        twentyNode.left = fifteenNode
        twentyNode.right = sevenNode

        val rootNode = Node(3)
        rootNode.left = nineNode
        rootNode.right = twentyNode

        return rootNode
    }

    /**
     * Create the following tree structure:
     *
     *      3
     *     / \
     *    2  5
     *   / \
     *  1  4
     */
    fun createTrickyNoBST(): Node<Int> {

        val oneNode = Node(1)
        val fourNode = Node(4)
        val fiveNode = Node(5)

        val twoNode = Node(2)
        twoNode.left = oneNode
        twoNode.right = fourNode

        val rootNode = Node(3)
        rootNode.left = twoNode
        rootNode.right = fiveNode

        return rootNode
    }
}