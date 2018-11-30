package com.fernandocejas.crackinginterview.tree

class TreeProblems {

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

        //TODO: Fix NPE left!!.data and right!!.data
        return (isValidBST(root.left, min, root.left!!.data) && isValidBST(root.right, max, root.right!!.data))
    }
}