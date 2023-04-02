package com.example.unittestingexample.utils

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class HelperTest {

    lateinit var helper: Helper
    @Before // set of line which i want to execute before every test case
    fun setUp(){
        println("Before every test case")
        helper = Helper()
    }

    @After   // set of line which i want to execute after every test case
    fun tearDown(){
        println("After every test case")
    }

    @Test // this annotation told us that this is a test method
    fun isPalindrome() {
        //arrange - we create objects
//        val helper = Helper()
        //act - we write actual testing code
        val result = helper.isPalindrome("hello")
        //assert - we assert the input
        assertEquals(false, result)

    }

    @Test
    fun isPalindrome_inputString_level_expectedTrue() {
        //arrange - we create objects
        val helper = Helper()
        //act - we write actual testing code
        val result = helper.isPalindrome("level")
        //assert - we assert the input
        assertEquals(true, result)

    }

    // code coverage- jo function ya class test kr rhe ho uski kitni line cover ho gyi

}