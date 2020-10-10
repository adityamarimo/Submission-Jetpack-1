package com.mojasoft.movieapp.ui.detail;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.ViewModelProvider;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.mojasoft.movieapp.R;
import com.mojasoft.movieapp.data.FilmEntity;
import com.mojasoft.movieapp.ui.movies.MoviesViewModel;
import com.mojasoft.movieapp.ui.tv.TvViewModel;

public class DetailActivity extends AppCompatActivity {

    public static final String EX_DATA = "extra_data";
    private TextView textTitle;
    private TextView textGenre;
    private TextView textDateRelease;
    private TextView textDuration;
    private TextView textRating;
    private TextView textDesc;
    private ImageView imagePoster;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        textTitle = findViewById(R.id.text_title);
        textGenre = findViewById(R.id.text_genre);
        textDuration = findViewById(R.id.text_duration);
        textRating = findViewById(R.id.text_rating);
        textDesc = findViewById(R.id.text_description);
        textDateRelease = findViewById(R.id.text_daterelease);
        imagePoster = findViewById(R.id.image_poster);
        progressBar = findViewById(R.id.progress_bar);

        MoviesViewModel moviesViewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(MoviesViewModel.class);
        TvViewModel tvViewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(TvViewModel.class);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String id = extras.getString(EX_DATA);
            if (id != null) {
                char[] characters = id.toCharArray();
                char firstChar = characters[0];

                if(firstChar == 'm'){
                    moviesViewModel.setSelectedMovies(id);
                    dataFilm(moviesViewModel.getDetailMovies());
                }else if (firstChar == 't'){
                    tvViewModel.setSelectedTv(id);
                    dataFilm(tvViewModel.getDetailTv());
                }

            }
        }
    }

    private void dataFilm(FilmEntity detailMovies) {
        textTitle.setText(detailMovies.getTitle());
        textGenre.setText(detailMovies.getGenre());
        textDuration.setText(String.format("Duration : %s", detailMovies.getDuration()));
        textRating.setText(String.format("Rating Users : %s", detailMovies.getRating()));
        textDesc.setText(detailMovies.getDescription());
        textDateRelease.setText(String.format("Date Realease %s", detailMovies.getDaterelease()));

        Glide.with(this)
                .load(detailMovies.getImagePath())
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error))
                .into(imagePoster);
    }
}