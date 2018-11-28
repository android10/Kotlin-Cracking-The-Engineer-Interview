package com.fernandocejas.crackinginterview.string

import kotlin.String

/**
 * A good thing about the string is that if you know the array, you can solve string-based
 * questions easily because strings are nothing but a character array.
 */
class StringProblems {

    /**
     * PROBLEM:
     * How do you print duplicate characters from a string?
     *
     * SOLUTION:
     * Linear -> O(n)
     */
    fun findDuplicates(string: String): String {
        var result = ""
        val charSet: MutableSet<Char> = hashSetOf()
        val stringWithoutSpaces = string.trim().replace(" ", "")

        stringWithoutSpaces.forEach {
            if (!charSet.add(it) && !result.contains(it)) { result += it }
        }

        return result
    }
}