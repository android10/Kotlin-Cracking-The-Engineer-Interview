package com.fernandocejas.crackinginterview.string

import org.amshove.kluent.`should be equal to`
import org.junit.jupiter.api.Test

internal class StringProblemsTest {

    private val stringProblems = StringProblems()

    @Test fun `should find duplicate characters`() {
        stringProblems.findDuplicates("holaah") `should be equal to` "ah"
        stringProblems.findDuplicates("asdfg") `should be equal to` ""
        stringProblems.findDuplicates("This is another sentence") `should be equal to` "ishent"
    }
}