package com.fernandocejas.crackinginterview.list

import org.amshove.kluent.`should be equal to`
import org.junit.jupiter.api.Test

internal class MyLinkedListTest {

    @Test fun `should be empty when creating a new linked list`() {
        val myLinkedList = MyLinkedList<String>()

        myLinkedList.isEmpty() `should be equal to` true
        myLinkedList.size() `should be equal to` 0
    }
}