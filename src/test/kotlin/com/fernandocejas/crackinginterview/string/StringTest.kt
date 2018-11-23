package com.fernandocejas.crackinginterview.string

import org.amshove.kluent.`should be equal to`
import org.junit.jupiter.api.Test

internal class StringTest {

    private val string = String()

    @Test fun `should find duplicate characters`() {
        string.findDuplicates("holaah") `should be equal to` "ah"
        string.findDuplicates("asdfg") `should be equal to` ""
        string.findDuplicates("This is another sentence") `should be equal to` "ishent"
    }
}