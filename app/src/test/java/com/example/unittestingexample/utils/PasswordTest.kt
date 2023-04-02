package com.example.unittestingexample.utils

import junit.framework.Assert
import org.junit.Test

class PasswordTest {

    @Test
    fun validatePassword_blankInput_expectedRequiredField() {
        val systemUnderTest = Utils()
        val result = systemUnderTest.isValidPassword("     ")
        Assert.assertEquals("Password is required field", result)
    }

    @Test
    fun validatePassword_2CharInput_expectedRequiredValidationMsg() {
        val systemUnderTest = Utils()
        val result = systemUnderTest.isValidPassword("ab")
        Assert.assertEquals("Length of the password should be greater than 6", result)
    }

    @Test
    fun validatePassword_validInput_expectedRequiredValidPassword() {
        val systemUnderTest = Utils()
        val result = systemUnderTest.isValidPassword("Pass123")
        Assert.assertEquals("Valid", result)
    }
}