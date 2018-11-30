package com.fernandocejas.crackinginterview.tree

import org.amshove.kluent.`should be`
import org.amshove.kluent.`should equal`
import org.junit.jupiter.api.Test

internal class TreeProblemsTest {
    private val treeProblems = TreeProblems()
    private val treeSamples = Sample()

    @Test fun `should return max depth`() {
        treeProblems.maxDepth(treeSamples.createBasicBST()) `should equal` 2
        treeProblems.maxDepth(treeSamples.createBasicTree()) `should equal` 3
    }

    @Test fun `should validate a BST`() {
        treeProblems.isValidBST(treeSamples.createBasicBST()) `should be` true
        treeProblems.isValidBST(treeSamples.createNoBST()) `should be` false
        treeProblems.isValidBST(treeSamples.createTrickyNoBST()) `should be` false
    }
}