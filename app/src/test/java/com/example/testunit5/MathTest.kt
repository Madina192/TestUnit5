package com.example.testunit5

import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {
    var math: Math? = null

    @Before
    fun init() {
        math = Math()
    }

    @Test
    fun simpleAdd() {
        assertEquals("5", math?.add("2", "3"))
    }

    @Test
    fun doubleAdd() {
        assertEquals("5", math?.add("2", "3.0"))
    }

    @Test
    fun doubleHardAdd() {
        assertEquals("5.2", math?.add("2.2", "3"))
    }

    @Test
    fun doubleDotAdd() {
        assertEquals("You entered two points!", math?.add("4..1", "0"))
    }

    @Test
    fun doubleSymbolAdd() {
        assertEquals("You can't enter letters!", math?.add("hello15", "9"))
    }

    @Test
    fun doubleEmptyAdd() {
        assertEquals("You didn't enter anything!", math?.add("7", ""))
    }

    @Test
    fun doubleSpaceAdd() {
        assertEquals("50", math?.add("2 ", "4 8"))
    }


    @Test
    fun simpleDivide() {
        assertEquals("3", math?.divide("12", "4"))
    }


    @Test
    fun zeroDivide() {
        assertEquals("You can't divide by 0!", math?.divide("25", "0"))
    }

    @Test
    fun emptyDivide() {
        assertEquals("You didn't enter anything!", math?.divide("6", ""))
    }

    @After
    fun detach() {
        math = null
    }
}