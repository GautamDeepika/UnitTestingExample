package com.example.unittestingexample

import android.app.Application
import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.gson.JsonSyntaxException
import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test
import java.io.FileNotFoundException


internal class QuoteManagerTest {

//    @Before
//    fun setUp() {
//    }
//
//    @After
//    fun tearDown() {
//    }

    @Test(expected = FileNotFoundException::class)
    fun populateQuoteFromAssets() {
        //Arrange
        val quoteManager = QuoteManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        //Act
        quoteManager.populateQuoteFromAssets(context, "")
        //Assert
        //we assert we get FileNotFound exception in this testcase.
    }

    @Test(expected = JsonSyntaxException::class)
    fun populateQuoteFromAssets_InvalidJSON_expected_exception() {
        //Arrange
        val quoteManager = QuoteManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        //Act
        quoteManager.populateQuoteFromAssets(context, "Malformed.json")
        //Assert
    }

    @Test
    fun populateQuoteFromAssets_validJSON_expected_Count() {
        //Arrange
        val quoteManager = QuoteManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        //Act
        quoteManager.populateQuoteFromAssets(context, "quotes.json")
        //Assert
        assertEquals(9, quoteManager.quoteList.size)
    }

    @Test
    fun testPreviousQuote_expected_CorrectQuote() {
        //Arrange
        val quoteManager = QuoteManager()
        quoteManager.populateQuotes(
            arrayOf(
                Quote("This is first quote", "1"),
                Quote("This is second quote", "2"),
                Quote("This is third quote", "3"),
                Quote("This is forth quote", "4")
            )
        )
        //Act
        val quote = quoteManager.previousQuote()
        //Assert
        assertEquals("1", quote.author)
    }

    @Test
    fun testNextQuote_expected_CorrectQuote() {
        //Arrange
        val quoteManager = QuoteManager()
        quoteManager.populateQuotes(
            arrayOf(
                Quote("This is first quote", "1"),
                Quote("This is second quote", "2") ,
                Quote("This is third quote", "3"),
                Quote("This is forth quote", "4")
            )
        )
        //Act
        val quote = quoteManager.nextQuote()
        //Assert
        assertEquals("2", quote.author)
    }
}