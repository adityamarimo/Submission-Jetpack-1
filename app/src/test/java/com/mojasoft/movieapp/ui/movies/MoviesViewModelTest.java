package com.mojasoft.movieapp.ui.movies;

import com.mojasoft.movieapp.data.FilmEntity;
import com.mojasoft.movieapp.utils.DataDummy;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MoviesViewModelTest {
    private MoviesViewModel viewModel;
    private FilmEntity dummyMovies = DataDummy.generateDummyMovies().get(0);
    private String movieId = dummyMovies.getFilmId();

    @Before
    public void setUp() {
        viewModel = new MoviesViewModel();
    }

    @Test
    public void getMovies() {
        List<FilmEntity> filmEntity = viewModel.getMovies();
        assertNotNull(filmEntity);
        assertEquals(10, filmEntity.size());
    }

    @Test
    public void setSelectedMovies() {
        viewModel.setSelectedMovies(movieId);
        assertEquals("m1", movieId);
    }

    @Test
    public void getDetailMovies() {
        viewModel.setSelectedMovies(dummyMovies.getFilmId());
        FilmEntity detailMovies = viewModel.getDetailMovies();
        assertNotNull(detailMovies);
        assertEquals(dummyMovies.getFilmId(), detailMovies.getFilmId());
        assertEquals(dummyMovies.getTitle(), detailMovies.getTitle());
        assertEquals(dummyMovies.getGenre(), detailMovies.getGenre());
        assertEquals(dummyMovies.getDescription(), detailMovies.getDescription());
        assertEquals(dummyMovies.getRating(), detailMovies.getRating());
        assertEquals(dummyMovies.getDuration(), detailMovies.getDuration());
        assertEquals(dummyMovies.getUrl(), detailMovies.getUrl());
        assertEquals(dummyMovies.getImagePath(), detailMovies.getImagePath());
    }
}