package com.example.unittestingexample.utils

class Helper {

    fun isPalindrome(input: String): Boolean {
        var i = 0
        var j = input.length - 1
        var result = true
        while (j > i){
            if (input[i] != input[j]){
                result = false
                break
            }
            i++
            j--
        }
        return result
    }
}