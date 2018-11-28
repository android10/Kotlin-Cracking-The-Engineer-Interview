package com.fernandocejas.crackinginterview.tree

class TreeProblems {

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

    /**
     * PROBLEM:
     * Given a binary tree, find its maximum depth.
     *
     * The maximum depth is the number of nodes along the longest path from the root node
     * down to the farthest leaf node.
     * Note: A leaf is a node with no children.
     *
     * SOLUTION:
     * Linear -> O(n)
     */
    fun maxDepth(root: Node<Int>?): Int {
        return when (root == null) {
            true -> 0
            false -> {
                val leftDepth = maxDepth(root.left)
                val rightDepth = maxDepth(root.right)

                Math.max(leftDepth, rightDepth).plus(1)
            }
        }
    }

    fun isValidBST(root: Node<Int>?, min: Int = Int.MIN_VALUE, max: Int = Int.MAX_VALUE): Boolean {
        if (root == null) return true

        if (root.left != null && (root.left!!.data > root.data) || root.left!!.data < min) return false
        if (root.right != null && (root.right!!.data < root.data || root.right!!.data > max)) return false

        return (isValidBST(root.left, min, root.left!!.data) && isValidBST(root.right, max, root.right!!.data))
    }
}