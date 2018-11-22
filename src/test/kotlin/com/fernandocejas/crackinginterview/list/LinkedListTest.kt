package com.fernandocejas.crackinginterview.list

import org.amshove.kluent.`should be equal to`
import org.junit.jupiter.api.Test

internal class LinkedListTest {

    private val linkedList = LinkedList()

    @Test fun `find middle element happy cases`() {
        val myLinkedListOne = java.util.LinkedList<String>()
        myLinkedListOne.add("One")
        myLinkedListOne.add("Two")
        myLinkedListOne.add("Three")
        linkedList.findMiddleElement(myLinkedListOne) `should be equal to` "Three"

        val myLinkedListTwo = java.util.LinkedList<Int>()
        myLinkedListTwo.add(1)
        myLinkedListTwo.add(2)
        myLinkedListTwo.add(3)
        myLinkedListTwo.add(4)
        linkedList.findMiddleElement(myLinkedListTwo) `should be equal to` 3
    }
}