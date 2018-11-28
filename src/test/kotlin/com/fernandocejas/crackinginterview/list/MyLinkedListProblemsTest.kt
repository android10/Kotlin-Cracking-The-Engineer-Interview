package com.fernandocejas.crackinginterview.list

import org.amshove.kluent.`should be equal to`
import org.junit.jupiter.api.Test

internal class MyLinkedListProblemsTest {

    @Test fun `should be empty when creating a new linked list`() {
        val myLinkedList = LinkedList<String>()

        myLinkedList.isEmpty() `should be equal to` true
        myLinkedList.size() `should be equal to` 0
    }
}