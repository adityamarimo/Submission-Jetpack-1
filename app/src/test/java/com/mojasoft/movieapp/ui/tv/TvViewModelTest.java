package com.mojasoft.movieapp.ui.tv;

import com.mojasoft.movieapp.data.FilmEntity;
import com.mojasoft.movieapp.utils.DataDummy;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TvViewModelTest {
    private TvViewModel viewModel;
    private FilmEntity dummyTv = DataDummy.generateDummyTv().get(0);
    private String tvId = dummyTv.getFilmId();

    @Before
    public void setUp() {
        viewModel = new TvViewModel();
    }

    @Test
    public void getTv() {
        List<FilmEntity> filmEntity = viewModel.getTv();
        assertNotNull(filmEntity);
        assertEquals(10, filmEntity.size());
    }

    @Test
    public void setSelectedTv() {
        viewModel.setSelectedTv(tvId);
        assertEquals("t1", tvId);
    }

    @Test
    public void getDetailTv() {
        viewModel.setSelectedTv(dummyTv.getFilmId());
        FilmEntity detailTv = viewModel.getDetailTv();
        assertNotNull(detailTv);
        assertEquals(dummyTv.getFilmId(), detailTv.getFilmId());
        assertEquals(dummyTv.getTitle(), detailTv.getTitle());
        assertEquals(dummyTv.getGenre(), detailTv.getGenre());
        assertEquals(dummyTv.getDescription(), detailTv.getDescription());
        assertEquals(dummyTv.getRating(), detailTv.getRating());
        assertEquals(dummyTv.getDuration(), detailTv.getDuration());
        assertEquals(dummyTv.getUrl(), detailTv.getUrl());
        assertEquals(dummyTv.getImagePath(), detailTv.getImagePath());
    }
}