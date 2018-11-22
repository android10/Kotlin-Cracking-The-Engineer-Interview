package com.fernandocejas.crackinginterview.array

import org.amshove.kluent.`should be equal to`
import org.amshove.kluent.`should contain all`
import org.amshove.kluent.`should equal`
import org.junit.jupiter.api.Test



internal class ArrayTest {

    private val array = Array()

    @Test fun `find duplicate - brute force`() {
        array.findDuplicateBruteForce(arrayOf(3, 5, 8, 9, 11, 5, 4, 1, 6)) `should be equal to` 5
        array.findDuplicateBruteForce(arrayOf(3, 3)) `should be equal to` 3
        array.findDuplicateBruteForce(arrayOf(0, 4, 1, 1)) `should be equal to` 1
    }

    @Test fun `array with no duplicates should return -1 - brute force`() {
        array.findDuplicateBruteForce(arrayOf(0, 4, 1, 2)) `should be equal to` -1
    }

    @Test fun `find duplicate - better`() {
        array.findDuplicateBetter(arrayOf(3, 5, 8, 9, 11, 5, 4, 1, 6)) `should be equal to` 5
        array.findDuplicateBetter(arrayOf(3, 3)) `should be equal to` 3
        array.findDuplicateBetter(arrayOf(0, 4, 1, 1)) `should be equal to` 1
    }

    @Test fun `array with no duplicates should return -1 - better`() {
        array.findDuplicateBetter(arrayOf(0, 4, 1, 2)) `should be equal to` -1
    }

    @Test fun `should remove duplicates - using Set`() {
        array.removeDuplicatesUsingSet(arrayOf(0, 0, 0, 1)) `should contain all` arrayOf(0, 1)
        array.removeDuplicatesUsingSet(arrayOf(1, 2, 3)) `should contain all` arrayOf(1, 2, 3)
        array.removeDuplicatesUsingSet(arrayOf(2, 2, 4, 4, 4, 5, 5)) `should contain all` arrayOf(2, 4, 5)
    }

    @Test fun `should remove duplicates`() {
        array.removeDuplicates(arrayOf(0, 0, 0, 1)) `should contain all` arrayOf(0, 1)
        array.removeDuplicates(arrayOf(1, 2, 3)) `should contain all` arrayOf(1, 2, 3)
        array.removeDuplicates(arrayOf(2, 2, 4, 4, 4, 5, 5)) `should contain all` arrayOf(2, 4, 5)
    }

    @Test fun `should reverse array using language built in functionality`() {
        array.reverseKotlin(arrayOf(2, 9, 0, 4, 2, 8, 1)) `should equal` arrayOf(1, 8, 2, 4, 0, 9, 2)
        array.reverseKotlin(arrayOf(1, 2, 3)) `should equal` arrayOf(3, 2, 1)
        array.reverseKotlin(arrayOf(0, 0, 1, 1)) `should equal` arrayOf(1, 1, 0, 0)
        array.reverseKotlin(arrayOf(10, 11)) `should equal` arrayOf(11, 10)
    }

    @Test fun `should reverse array`() {
        array.reverse(arrayOf(2, 9, 0, 4, 2, 8, 1)) `should equal` arrayOf(1, 8, 2, 4, 0, 9, 2)
        array.reverse(arrayOf(1, 2, 3)) `should equal` arrayOf(3, 2, 1)
        array.reverse(arrayOf(0, 0, 1, 1)) `should equal` arrayOf(1, 1, 0, 0)
        array.reverse(arrayOf(10, 11)) `should equal` arrayOf(11, 10)
        array.reverse(arrayOf("One", "Two", "Three")) `should equal` arrayOf("Three", "Two", "One")
    }
}