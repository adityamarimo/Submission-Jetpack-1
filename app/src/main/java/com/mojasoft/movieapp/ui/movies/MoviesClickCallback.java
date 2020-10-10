package com.mojasoft.movieapp.ui.movies;

import com.mojasoft.movieapp.data.FilmEntity;

interface MoviesClickCallback {
    void onShareClick(FilmEntity filmEntity);
}
