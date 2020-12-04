package com.filbertfilbert.uts;


import androidx.test.espresso.DataInteraction;
import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import static androidx.test.InstrumentationRegistry.getInstrumentation;
import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;

import com.filbertfilbert.uts.R;
import com.filbertfilbert.uts.UnitTest.LoginActivity;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class LoginActivityTest9901 {

    @Rule
    public ActivityTestRule<LoginActivity> mActivityTestRule = new ActivityTestRule<>(LoginActivity.class);

    @Test
    public void loginActivityTest9901() {
        ViewInteraction textInputEditText = onView(
                allOf(withId(R.id.input_email),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_nomor_layout),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText.perform(replaceText("filbertaliang2000@gmail.com"));

        ViewInteraction textInputEditText2 = onView(
                allOf(withId(R.id.input_password),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_name_layout),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText2.perform(replaceText("1234567"));

        ViewInteraction materialButton = onView(
                allOf(withId(R.id.btn_login), withText("LOGIN"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                3),
                        isDisplayed()));
        materialButton.perform(click());

        ViewInteraction textInputEditText3 = onView(
                allOf(withId(R.id.input_email), withText("filbertaliang2000@gmail.com"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_nomor_layout),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText3.perform(replaceText("filbertaliang2000"));

        ViewInteraction textInputEditText4 = onView(
                allOf(withId(R.id.input_email), withText("filbertaliang2000"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_nomor_layout),
                                        0),
                                0),
                        isDisplayed()));


        ViewInteraction textInputEditText5 = onView(
                allOf(withId(R.id.input_password), withText("1234567"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_name_layout),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText5.perform(replaceText("123456"));

        ViewInteraction textInputEditText6 = onView(
                allOf(withId(R.id.input_password), withText("123456"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_name_layout),
                                        0),
                                1),
                        isDisplayed()));

        ViewInteraction materialButton2 = onView(
                allOf(withId(R.id.btn_login), withText("LOGIN"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                3),
                        isDisplayed()));
        materialButton2.perform(click());

        ViewInteraction textInputEditText7 = onView(
                allOf(withId(R.id.input_email), withText("filbertaliang2000"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_nomor_layout),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText7.perform(replaceText("filbertaliang2000@gmail.com"));

        ViewInteraction textInputEditText8 = onView(
                allOf(withId(R.id.input_email), withText("filbertaliang2000@gmail.com"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_nomor_layout),
                                        0),
                                0),
                        isDisplayed()));


        ViewInteraction textInputEditText9 = onView(
                allOf(withId(R.id.input_password), withText("123456"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_name_layout),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText9.perform(replaceText("123"));

        ViewInteraction textInputEditText10 = onView(
                allOf(withId(R.id.input_password), withText("123"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_name_layout),
                                        0),
                                1),
                        isDisplayed()));


        ViewInteraction materialButton3 = onView(
                allOf(withId(R.id.btn_login), withText("LOGIN"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                3),
                        isDisplayed()));
        materialButton3.perform(click());

        ViewInteraction textInputEditText11 = onView(
                allOf(withId(R.id.input_email), withText("filbertaliang2000@gmail.com"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_nomor_layout),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText11.perform(replaceText(""));

        ViewInteraction textInputEditText12 = onView(
                allOf(withId(R.id.input_email),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_nomor_layout),
                                        0),
                                0),
                        isDisplayed()));


        ViewInteraction textInputEditText13 = onView(
                allOf(withId(R.id.input_password), withText("123"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_name_layout),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText13.perform(replaceText("123456"));

        ViewInteraction textInputEditText14 = onView(
                allOf(withId(R.id.input_password), withText("123456"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_name_layout),
                                        0),
                                0),
                        isDisplayed()));


        ViewInteraction materialButton4 = onView(
                allOf(withId(R.id.btn_login), withText("LOGIN"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                3),
                        isDisplayed()));
        materialButton4.perform(click());

        ViewInteraction textInputEditText15 = onView(
                allOf(withId(R.id.input_email),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_nomor_layout),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText15.perform(replaceText("filbertaliang2000@gmail.com"));

        ViewInteraction textInputEditText16 = onView(
                allOf(withId(R.id.input_password), withText("123456"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_name_layout),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText16.perform(replaceText("12345678901"));

        ViewInteraction textInputEditText17 = onView(
                allOf(withId(R.id.input_password), withText("12345678901"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_name_layout),
                                        0),
                                0),
                        isDisplayed()));

        ViewInteraction materialButton5 = onView(
                allOf(withId(R.id.btn_login), withText("LOGIN"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                3),
                        isDisplayed()));
        materialButton5.perform(click());

        ViewInteraction textInputEditText18 = onView(
                allOf(withId(R.id.input_password), withText("12345678901"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_name_layout),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText18.perform(click());

        ViewInteraction textInputEditText19 = onView(
                allOf(withId(R.id.input_password), withText("12345678901"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_name_layout),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText19.perform(replaceText("123456"));

        ViewInteraction textInputEditText20 = onView(
                allOf(withId(R.id.input_password), withText("123456"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_name_layout),
                                        0),
                                0),
                        isDisplayed()));


        ViewInteraction materialButton6 = onView(
                allOf(withId(R.id.btn_login), withText("LOGIN"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                3),
                        isDisplayed()));
        materialButton6.perform(click());
        System.out.println("Login Sukses");
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
