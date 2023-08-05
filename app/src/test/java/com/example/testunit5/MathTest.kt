package com.example.testunit5

import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {
    var math : Math ?= null

    @Before
    fun init() {
        math = Math()
    }

    @Test
    fun simpleAdd() {
        assertEquals("5", math?.add("2", "3"))
    }

    @After
    fun detach() {
        math = null
    }
}