package com.fernandocejas.crackinginterview.recursion

/**
 * Recursion is a computer programming technique involving the use of a procedure,
 * subroutine, function, or algorithm that calls itself in a step having a termination
 * condition so that successive repetitions are processed up to the critical step where
 * the condition is met at which time the rest of each repetition is processed from the
 * last one called to the first.
 */
class Recursion {

    /**
     * The factorial function, often denoted as n!, describes the operation of multiplying
     * a number by all the positive integers smaller than it.
     * For example, 5! = 5*4*3*2*1. And 9! = 9*8*7*6*5*4*3*2*1.
     */
    fun factorial(number: Int): Int {
        return when {
            (number < 0) -> 0
            (number <= 1) -> 1
            else -> { number * factorial(number.minus(1))}
        }
    }

    /**
     * O(2N) denotes an algorithm whose growth doubles with each addition to the input
     * data set. The growth curve of an O(2N) function is exponential - starting off
     * very shallow, then rising meteorically.
     *
     * @number: the nth number in the Fibonacci sequence.
     */
    fun fibonacci(number: Int): Int {
        return when {
            (number <= 1) -> number
            else -> { fibonacci(number - 1) + fibonacci(number - 2) }
        }
    }
}