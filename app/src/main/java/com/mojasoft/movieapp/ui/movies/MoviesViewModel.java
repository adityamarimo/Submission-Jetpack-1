package com.mojasoft.movieapp.ui.movies;

import androidx.lifecycle.ViewModel;

import com.mojasoft.movieapp.data.FilmEntity;
import com.mojasoft.movieapp.utils.DataDummy;

import java.util.List;

public class MoviesViewModel extends ViewModel {
    private String moviesId;

    public List<FilmEntity> getMovies() {
        return DataDummy.generateDummyMovies();
    }

    public void setSelectedMovies(String movies) {
        this.moviesId = movies;
    }

    public FilmEntity getDetailMovies() {
        FilmEntity film = null;
        List<FilmEntity> filmEntities = DataDummy.generateDummyMovies();
        for (FilmEntity courseEntity : filmEntities) {
            if (courseEntity.getFilmId().equals(moviesId)) {
                film = courseEntity;
            }
        }
        return film;
    }

}
