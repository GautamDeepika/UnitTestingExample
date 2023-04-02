package com.example.unittestingexample.utils

class Utils {

    fun isValidPassword(input: String) = when {
        input.isBlank() -> {
            "Password is required field"
        }
        input.length < 6 -> {
            "Length of the password should be greater than 6"
        }
        input.length > 15 -> {
            "Length of the password should be less than 15"
        }
        else -> {
            "Valid"
        }
    }

    fun reverseString(input: String?): String {
        if (input == null) {
            throw java.lang.IllegalArgumentException("Input String is Required")
        }
        var chars = input.toCharArray()
        var i = 0
        var j = chars.size - 1
        while (j > i) {
            val temp = chars[i]
            chars[i] = chars[j]
            chars[j] = temp
            i++
            j--
        }
        return chars.joinToString("")
    }


}