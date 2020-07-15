package ru.otus.first

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.expect

class FirstMainKtTest {

    // kotlin.test
    @Test
    fun firstTest() {
        expect(1) {
            2-1
        }
    }

    @Test
    fun secondTest() {
        assertEquals(1, 2-1)
    }
}
