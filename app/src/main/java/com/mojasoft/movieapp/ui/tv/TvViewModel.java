package com.mojasoft.movieapp.ui.tv;

import androidx.lifecycle.ViewModel;

import com.mojasoft.movieapp.data.FilmEntity;
import com.mojasoft.movieapp.utils.DataDummy;

import java.util.List;

public class TvViewModel extends ViewModel {
    private String tvId;

    public List<FilmEntity> getTv() {
        return DataDummy.generateDummyTv();
    }

    public void setSelectedTv(String tv) {
        this.tvId = tv;
    }

    public FilmEntity getDetailTv() {
        FilmEntity film = null;
        List<FilmEntity> filmEntities = DataDummy.generateDummyTv();
        for (FilmEntity courseEntity : filmEntities) {
            if (courseEntity.getFilmId().equals(tvId)) {
                film = courseEntity;
            }
        }
        return film;
    }
}
