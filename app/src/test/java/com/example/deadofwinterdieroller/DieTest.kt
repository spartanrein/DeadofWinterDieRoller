package com.example.deadofwinterdieroller

import org.junit.jupiter.api.Test

internal class DieTest {

    private val die = Die()

    @Test
    fun `should return "bite" if die rolls 1`() {
        assert("bite" == die.roll(1))
    }

    @Test
    fun `should return "frostbite" if die rolls from 2 till 3`() {
        assert("frostbite" == die.roll(3))
    }

    @Test
    fun `should return "wound" if die rolls from 4 to 6`() {
        assert("wound" == die.roll(6))
    }

    @Test
    fun `should return "safe" if die rolls from 7 to 12`() {
        assert("safe" == die.roll(8))
    }
}
