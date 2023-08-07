package com.example.testunit5

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.Test

class ActivityTest {

    @Rule
    @JvmField
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleAdd() {
        runBlocking {
            Espresso.onView(withId(R.id.etFirst)).perform(ViewActions.typeText("45"))
            Espresso.onView(withId(R.id.etFirst)).perform(ViewActions.closeSoftKeyboard())
            delay(2000)
            Espresso.onView(withId(R.id.etSecond)).perform(ViewActions.typeText("10"))
            Espresso.onView(withId(R.id.etSecond)).perform(ViewActions.closeSoftKeyboard())
            delay(2000)
            Espresso.onView(withId(R.id.btnAdd)).perform(ViewActions.click())
            delay(2000)
            Espresso.onView(withId(R.id.tvResult))
                .check(ViewAssertions.matches(ViewMatchers.withText("55")))
            delay(2000)
        }
    }

    @Test
    fun simpleDivide() {
        runBlocking {
            Espresso.onView(withId(R.id.etFirst)).perform(ViewActions.typeText("80"))
            Espresso.onView(withId(R.id.etFirst)).perform(ViewActions.closeSoftKeyboard())
            delay(1000)
            Espresso.onView(withId(R.id.etSecond)).perform(ViewActions.typeText("4"))
            Espresso.onView(withId(R.id.etSecond)).perform(ViewActions.closeSoftKeyboard())
            delay(1000)
            Espresso.onView(withId(R.id.btnDivide)).perform(ViewActions.click())
            delay(1000)
            Espresso.onView(withId(R.id.tvResult))
                .check(ViewAssertions.matches(ViewMatchers.withText("20")))
            delay(1000)
        }
    }
}