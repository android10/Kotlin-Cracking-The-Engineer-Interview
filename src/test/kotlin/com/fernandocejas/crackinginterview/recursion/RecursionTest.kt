package com.fernandocejas.crackinginterview.recursion

import org.amshove.kluent.`should equal`
import org.junit.jupiter.api.Test

internal class RecursionTest {

    private val recursion = Recursion()

    @Test fun `factorial happy case`() {
        recursion.factorial(5) `should equal` 120
    }

    @Test fun `factorial of negative number should be zero`() {
        recursion.factorial(-1) `should equal` 0
    }

    @Test fun `factorial of zero should one`() {
        recursion.factorial(0) `should equal` 1
    }

    @Test fun `fibonacci happy case`() {
        recursion.fibonacci(7) `should equal` 13
    }
}