package com.fernandocejas.crackinginterview.complexity

/**
 * Big O notation is used in Computer Science to describe the performance or complexity
 * of an algorithm. Big O specifically describes the worst-case scenario, and can be
 * used to describe the execution time required or the space used (e.g. in memory or on disk)
 * by an algorithm.
 *
 * With Big O Notation we express the runtime in terms of :
 *
 * 1 - HOW QUICKLY THE RUNTIME GROWS —
 *  Being that it is difficult to determine the exact runtime of an algorithm.
 * It depends on the speed of the computer processor. So instead of talking about
 * the runtime directly, we use Big O Notation to talk about how quickly the runtime grows.
 *
 * 2 - RELATIVE TO THE INPUT —
 *  If we were measuring our runtime directly, we could express our speed in seconds and minutes.
 * Since we are measuring how quickly our runtime grows, we need to express our speed in terms
 * of something else. With Big O Notation, we use the size of the input, which we call “n”.
 * So we can say things like the runtime grows “on the order of the size of the input” (O(n))
 * or “on the order of the square of the size of the input” (O(n²)).
 *
 * 3 - AS THE INPUT GETS LARGER —
 *  Our algorithm may have steps that seem expensive when n is small but are eclipsed eventually
 * by other steps as n gets larger. For Big O Notation analysis, we care more about the stuff
 * that grows fastest as the input grows, because everything else is quickly eclipsed as n
 * gets very large.
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
     * QUADRATIC: O(N2) represents an algorithm whose performance is directly proportional to
     * the square of the size of the input data set. This is common with algorithms
     * that involve nested iterations over the data set.
     * Deeper nested iterations will result in O(N3), O(N4) etc.
     */
    fun containsDuplicates(elements: List<String>): Boolean {
        for (i in elements.indices) {
            for (j in elements.indices) {
                if (i != j) continue
                if (elements[i] == elements[j]) return true
            }
        }
        return false
    }

    /**
     * O(2N) denotes an algorithm whose growth doubles with each addition to the input
     * data set. The growth curve of an O(2N) function is exponential - starting off
     * very shallow, then rising meteorically.
     *
     * @number: the nth number in the Fibonacci sequence.
     */
    fun fibonacci(number: Int): Int {
        if (number <= 1) return number
        return fibonacci(number - 1) + fibonacci(number - 2)
    }
}