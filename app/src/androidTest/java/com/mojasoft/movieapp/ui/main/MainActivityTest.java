package com.mojasoft.movieapp.ui.main;

import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.rule.ActivityTestRule;

import com.mojasoft.movieapp.R;
import com.mojasoft.movieapp.data.FilmEntity;
import com.mojasoft.movieapp.utils.DataDummy;

import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityTest {

    private List<FilmEntity> dummyMovies = DataDummy.generateDummyMovies();
    private List<FilmEntity> dummyTv = DataDummy.generateDummyTv();

    @Rule
    public ActivityTestRule activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void loadMovies() {
        onView(withId(R.id.rv_movies)).check(matches(isDisplayed()));
        onView(withId(R.id.rv_movies)).perform(RecyclerViewActions.scrollToPosition(dummyMovies.size()));
    }

    @Test
    public void loadDetailMovies() {
        onView(withId(R.id.rv_movies)).perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));
        onView(withId(R.id.text_title)).check(matches(isDisplayed()));
        onView(withId(R.id.text_title)).check(matches(withText(dummyMovies.get(0).getTitle())));
        onView(withId(R.id.text_genre)).check(matches(isDisplayed()));
        onView(withId(R.id.text_genre)).check(matches(withText(dummyMovies.get(0).getGenre())));
        onView(withId(R.id.text_duration)).check(matches(isDisplayed()));
        onView(withId(R.id.text_duration)).check(matches(withText(String.format("Duration : %s", dummyMovies.get(0).getDuration()))));
        onView(withId(R.id.text_rating)).check(matches(isDisplayed()));
        onView(withId(R.id.text_rating)).check(matches(withText(String.format("Rating Users : %s", dummyMovies.get(0).getRating()))));
        onView(withId(R.id.text_description)).check(matches(isDisplayed()));
        onView(withId(R.id.text_description)).check(matches(withText(dummyMovies.get(0).getDescription())));
        onView(withId(R.id.text_daterelease)).check(matches(isDisplayed()));
        onView(withId(R.id.text_daterelease)).check(matches(withText(String.format("Date Realease %s", dummyMovies.get(0).getDaterelease()))));
    }

    @Test
    public void loadTvShows() {
        onView(withText("Tv Shows")).perform(click());
        onView(withId(R.id.rv_tv)).check(matches(isDisplayed()));
        onView(withId(R.id.rv_tv)).perform(RecyclerViewActions.scrollToPosition(dummyTv.size()));
    }
}