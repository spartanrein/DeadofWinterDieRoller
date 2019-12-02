package com.example.deadofwinterdieroller

import kotlin.random.Random

class Die {

    fun roll(numRolled: Int? = Random.nextInt(1, 12)): String {
        return when (numRolled) {
            1 -> "bite"
            in 2..3 -> "frostbite"
            in 4..6 -> "wound"
            else -> "safe"
        }
    }
}
