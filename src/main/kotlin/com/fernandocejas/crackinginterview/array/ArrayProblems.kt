package com.fernandocejas.crackinginterview.array

import kotlin.Array

/**
 * An array is the most fundamental data structure, which stores elements at a contiguous
 * memory location. The key benefit of an array data structure is that it offers fast O(1)
 * search if you know the index, but adding and removing an element from an array is slow
 * because you cannot change the size of the array once it’s created.
 *
 * In order to create a shorter or longer array, you need to create a new array and copy
 * all elements from old to new.
 */
class ArrayProblems {

    /**
     * PROBLEM:
     * How do you find the duplicate number on a given integer array?
     *
     * SOLUTION:
     * Brute force -> quadratic -> O(n2)
     */
    fun findDuplicateBruteForce(array: Array<Int>): Int {
        for (i in array.indices) {
            for (j in array.indices) {
                if (i == j) continue
                if (array[i] == array[j]) return array[i]
            }
        }
        return -1
    }

    /**
     * PROBLEM:
     * How do you find the duplicate number on a given integer array?
     *
     * SOLUTION:
     * Better solution -> linear -> O(n)
     */
    fun findDuplicateBetter(array: Array<Int>): Int {
        val sortedArray = array.sortedArray()
        for (i in 0..sortedArray.size - 2) {
            if (sortedArray[i] == sortedArray[i+1]) return sortedArray[i]
        }
        return -1
    }

    /**
     * PROBLEM:
     * How do you find the duplicate numbers on a given integer array?
     *
     * SOLUTION:
     * Linear -> O(n)
     */
    fun removeDuplicatesUsingSet(array: Array<Int>): Array<Int> =
            array.toHashSet().toTypedArray()

    /**
     * PROBLEM:
     * How do you find the duplicate numbers on a given integer array?
     *
     * SOLUTION:
     * Linear -> O(n)
     */
    fun removeDuplicates(array: Array<Int>): Array<Int> {
        val set: MutableSet<Int> = HashSet()
        repeat(array.size) { set.add(array[it]) }
        return set.toTypedArray()
    }

    /**
     * PROBLEM:
     * How do you reverse an array in place?
     *
     * SOLUTION:
     * O(n/2)
     */
    fun reverseKotlin(array: Array<Int>) = array.reversedArray()

    /**
     * PROBLEM:
     * How do you reverse an array in place?
     *
     * SOLUTION:
     * O(n/2)
     */
    fun <T> reverse(array: Array<T>): Array<T> {
        var reverseIndex = array.size - 1
        for (i in array.indices) {
            if (i >= reverseIndex) break

            val tempValue = array[i]
            array[i] = array[reverseIndex]
            array[reverseIndex] = tempValue
            reverseIndex--
        }
        return array
    }
}