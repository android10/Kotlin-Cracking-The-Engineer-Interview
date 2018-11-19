package com.fernandocejas.crackinginterview.util

import kotlin.system.measureTimeMillis

inline fun measureMillis(blockName: String = "Function", block: () -> Unit) {
    val timeMillis = measureTimeMillis { block() }
    println("Elapsed time for $blockName: $timeMillis millis.")
}