package com.example.unittestingexample.utils

import org.junit.Assert
import org.junit.Test

class StringTest {

    @Test
    fun testStringReversal_EmptyString_expectedEmptyString() {
        val systemUnderTest = Utils()
        val result = systemUnderTest.reverseString("")
        Assert.assertEquals("", result)
    }

    @Test
    fun testStringReversal_SingleChar_expectedSingleChar() {
        val systemUnderTest = Utils()
        val result = systemUnderTest.reverseString("a")
        Assert.assertEquals("a", result)
    }

    @Test
    fun testStringReversal_ValidString_expectedSameString() {
        val systemUnderTest = Utils()
        val result = systemUnderTest.reverseString("Hello")
        Assert.assertEquals("olleH", result)
    }

    @Test(expected = java.lang.IllegalArgumentException::class)
    fun testStringReversal_NullValue_expectedException() {
        val systemUnderTest = Utils()
        systemUnderTest.reverseString(null)
    }
}