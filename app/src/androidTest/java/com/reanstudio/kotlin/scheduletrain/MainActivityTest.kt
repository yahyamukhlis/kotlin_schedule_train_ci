package com.reanstudio.kotlin.scheduletrain

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withText

/**
 * Created by yahyamukhlis on 1/17/17.
 */

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule @JvmField
    var main = ActivityTestRule(MainActivity::class.java)

    @Test
    fun showMainScreen() {
        onView(withText("Hello World!")).check(ViewAssertions.matches(isDisplayed()))
    }
}
