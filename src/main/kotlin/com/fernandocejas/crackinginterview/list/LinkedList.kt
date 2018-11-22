package com.fernandocejas.crackinginterview.list

import java.util.LinkedList

/**
 * A linked list is another common data structure that complements the array data structure.
 * Similar to the array, it is also a linear data structure and stores elements in a linear fashion.
 *
 * However, unlike the array, it does not store them in contiguous locations; instead, they
 * are scattered everywhere in memory, which is connected to each other using nodes.
 *
 * A linked list is nothing but a list of nodes where each node contains the value stored and
 * the address of the next node.
 *
 * Because of this structure, it’s easy to add and remove elements in a linked list, as you just
 * need to change the link instead of creating the array, but the search is difficult and often
 * requires O(n) time to find an element in the singly linked list.
 *
 * It also comes in varieties like a singly linked list, which allows you to traverse in one
 * direction (forward or reverse); a doubly linked list, which allows you to traverse in both
 * directions (forward and backward); and finally, the circular linked list, which forms a circle.
 *
 * In order to solve linked list-based questions, a good knowledge of recursion is important,
 * because a linked list is a recursive data structure.
 *
 * If you take one node from a linked list, the remaining data structure is still a linked list,
 * and because of that, many linked list problems have simpler recursive solutions than
 * iterative ones.
 */
class LinkedList {

    /**
     * PROBLEM:
     * How do you find the middle element of a singly linked list in one pass?
     *
     * SOLUTION:
     * Linear -> O(n)
     */
    fun <T> findMiddleElement(list: LinkedList<T>): T {
        val listSize = list.size
        val middle =  when (listSize.rem(2)) {
             0 -> listSize / 2
            else -> (listSize / 2) + 1
        }
        return list[middle]
    }
}