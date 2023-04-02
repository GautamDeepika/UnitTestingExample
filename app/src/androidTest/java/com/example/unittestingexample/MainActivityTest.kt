package com.example.unittestingexample

import android.content.Intent
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.hasAction
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.activityScenarioRule
import org.hamcrest.core.AllOf.allOf
import org.junit.Assert.*

import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule   // we need instance of main activity so to test the next button we need to launch main activity so we define this rule.
    val activityScenarioRule = activityScenarioRule<MainActivity>()


    @Test
    fun testNextButton_expectedCorrect() {

        Espresso.onView(withId(R.id.btnNext)).perform(click())
        Espresso.onView(withId(R.id.btnNext)).perform(click())
        Espresso.onView(withId(R.id.btnNext)).perform(click())
        Espresso.onView(withId(R.id.btnNext)).perform(click())
        Espresso.onView(withId(R.id.quoteText))
            .check(matches(withText("Difficulties increase the nearer we get to the goal.")))
    }

    @Test
    fun testShareBtn_expectedIntentChooser() {
        Intents.init()
        val expected = allOf(hasAction(Intent.ACTION_SEND))
        Espresso.onView(withId(R.id.floatingActionButton)).perform(click())
        intended(expected)
        Intents.release()
    }
}