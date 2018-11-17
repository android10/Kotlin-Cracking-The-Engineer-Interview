package com.fernandocejas.crackinginterview.complexity

/**
 * Big O notation is used in Computer Science to describe the performance or complexity
 * of an algorithm. Big O specifically describes the worst-case scenario, and can be
 * used to describe the execution time required or the space used (e.g. in memory or on disk)
 * by an algorithm.
 */
class BigO {

    /**
     * CONSTANT: O(1) describes an algorithm that will always execute in the same time
     * (or space) regardless of the size of the input data set.
     */
    fun firstElement(elements: Array<String>) = elements.firstOrNull()

    /**
     * LINEAR: O(N) describes an algorithm whose performance will grow linearly and in
     * direct proportion to the size of the input data set.
     */
    fun constainsValue(elements: Array<String>, search: String): Boolean {
        elements.forEach { if (it == search) return true }
        return false
    }

    /**
     * O(N2) represents an algorithm whose performance is directly proportional to
     * the square of the size of the input data set. This is common with algorithms
     * that involve nested iterations over the data set.
     * Deeper nested iterations will result in O(N3), O(N4) etc.
     */
    fun containsDuplicates() {

    }

    /**
     * O(2N) denotes an algorithm whose growth doubles with each additon to the input
     * data set. The growth curve of an O(2N) function is exponential - starting off
     * very shallow, then rising meteorically.
     */
    fun fibonacci() {

    }
}