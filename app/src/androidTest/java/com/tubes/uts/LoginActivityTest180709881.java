package com.tubes.uts;


import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.pressImeActionButton;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class LoginActivityTest180709881 {

    @Rule
    public ActivityTestRule<SplashActivity> mActivityTestRule = new ActivityTestRule<>(SplashActivity.class);

    @Test
    public void loginActivityTest180709881() {
        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ViewInteraction textInputEditText = onView(
                allOf(withId(R.id.input_email),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_nomor_layout),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText.perform(click());

        ViewInteraction textInputEditText2 = onView(
                allOf(withId(R.id.input_email),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_nomor_layout),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText2.perform(replaceText("180709881@gmail.com"), closeSoftKeyboard());

        ViewInteraction textInputEditText3 = onView(
                allOf(withId(R.id.input_password),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_name_layout),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText3.perform(replaceText("123456"), closeSoftKeyboard());

        ViewInteraction textInputEditText4 = onView(
                allOf(withId(R.id.input_password), withText("123456"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_name_layout),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText4.perform(pressImeActionButton());

        ViewInteraction materialButton = onView(
                allOf(withId(R.id.btn_login), withText("LOGIN"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                3),
                        isDisplayed()));
        materialButton.perform(click());

        ViewInteraction textInputEditText5 = onView(
                allOf(withId(R.id.input_email), withText("180709881@gmail.com"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_nomor_layout),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText5.perform(replaceText("180709881"));

        ViewInteraction textInputEditText6 = onView(
                allOf(withId(R.id.input_email), withText("180709881"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_nomor_layout),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText6.perform(closeSoftKeyboard());

        ViewInteraction textInputEditText7 = onView(
                allOf(withId(R.id.input_email), withText("180709881"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_nomor_layout),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText7.perform(pressImeActionButton());

        ViewInteraction textInputEditText8 = onView(
                allOf(withId(R.id.input_password), withText("123456"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_name_layout),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText8.perform(pressImeActionButton());

        ViewInteraction materialButton2 = onView(
                allOf(withId(R.id.btn_login), withText("LOGIN"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                3),
                        isDisplayed()));
        materialButton2.perform(click());

        ViewInteraction textInputEditText9 = onView(
                allOf(withId(R.id.input_email), withText("180709881"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_nomor_layout),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText9.perform(replaceText("180709881@gmail.com"));

        ViewInteraction textInputEditText10 = onView(
                allOf(withId(R.id.input_email), withText("180709881@gmail.com"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_nomor_layout),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText10.perform(closeSoftKeyboard());

        ViewInteraction textInputEditText11 = onView(
                allOf(withId(R.id.input_password), withText("123456"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_name_layout),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText11.perform(replaceText("123"));

        ViewInteraction textInputEditText12 = onView(
                allOf(withId(R.id.input_password), withText("123"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_name_layout),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText12.perform(closeSoftKeyboard());

        ViewInteraction textInputEditText13 = onView(
                allOf(withId(R.id.input_password), withText("123"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_name_layout),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText13.perform(pressImeActionButton());

        ViewInteraction materialButton3 = onView(
                allOf(withId(R.id.btn_login), withText("LOGIN"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                3),
                        isDisplayed()));
        materialButton3.perform(click());

        ViewInteraction textInputEditText14 = onView(
                allOf(withId(R.id.input_password), withText("123"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_name_layout),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText14.perform(replaceText("180709881"));

        ViewInteraction textInputEditText15 = onView(
                allOf(withId(R.id.input_password), withText("180709881"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_name_layout),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText15.perform(closeSoftKeyboard());

        ViewInteraction textInputEditText16 = onView(
                allOf(withId(R.id.input_email), withText("180709881@gmail.com"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_nomor_layout),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText16.perform(replaceText("nando180709881@gmail.com"));

        ViewInteraction textInputEditText17 = onView(
                allOf(withId(R.id.input_email), withText("nando180709881@gmail.com"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_nomor_layout),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText17.perform(closeSoftKeyboard());

        ViewInteraction textInputEditText18 = onView(
                allOf(withId(R.id.input_email), withText("nando180709881@gmail.com"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_nomor_layout),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText18.perform(pressImeActionButton());

        ViewInteraction textInputEditText19 = onView(
                allOf(withId(R.id.input_password), withText("180709881"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_name_layout),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText19.perform(pressImeActionButton());

        ViewInteraction materialButton4 = onView(
                allOf(withId(R.id.btn_login), withText("LOGIN"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                3),
                        isDisplayed()));
        materialButton4.perform(click());

        ViewInteraction textInputEditText20 = onView(
                allOf(withId(R.id.input_email), withText("nando180709881@gmail.com"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_nomor_layout),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText20.perform(replaceText(""));

        ViewInteraction textInputEditText21 = onView(
                allOf(withId(R.id.input_email),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_nomor_layout),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText21.perform(closeSoftKeyboard());

        ViewInteraction materialButton5 = onView(
                allOf(withId(R.id.btn_login), withText("LOGIN"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                3),
                        isDisplayed()));
        materialButton5.perform(click());

        ViewInteraction textInputEditText22 = onView(
                allOf(withId(R.id.input_email),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_nomor_layout),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText22.perform(click());

        ViewInteraction textInputEditText23 = onView(
                allOf(withId(R.id.input_email),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_nomor_layout),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText23.perform(replaceText("180709881@gmail.com"), closeSoftKeyboard());

        ViewInteraction textInputEditText24 = onView(
                allOf(withId(R.id.input_password), withText("180709881"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_name_layout),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText24.perform(replaceText(""));

        ViewInteraction textInputEditText25 = onView(
                allOf(withId(R.id.input_password),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_name_layout),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText25.perform(closeSoftKeyboard());

        ViewInteraction textInputEditText26 = onView(
                allOf(withId(R.id.input_password),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_name_layout),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText26.perform(pressImeActionButton());

        ViewInteraction materialButton6 = onView(
                allOf(withId(R.id.btn_login), withText("LOGIN"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                3),
                        isDisplayed()));
        materialButton6.perform(click());
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
