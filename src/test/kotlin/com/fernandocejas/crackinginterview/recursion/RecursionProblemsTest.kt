package com.fernandocejas.crackinginterview.recursion

import org.amshove.kluent.`should equal`
import org.junit.jupiter.api.Test

internal class RecursionProblemsTest {

    private val recursionProblems = RecursionProblems()

    @Test fun `factorial happy case`() {
        recursionProblems.factorial(5) `should equal` 120
    }

    @Test fun `factorial of negative number should be zero`() {
        recursionProblems.factorial(-1) `should equal` 0
    }

    @Test fun `factorial of zero should one`() {
        recursionProblems.factorial(0) `should equal` 1
    }

    @Test fun `fibonacci happy case`() {
        recursionProblems.fibonacci(7) `should equal` 13
    }
}