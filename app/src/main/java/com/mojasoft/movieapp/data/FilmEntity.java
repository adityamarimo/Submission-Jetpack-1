package com.mojasoft.movieapp.data;

public class FilmEntity {

    private String filmId;
    private String title;
    private String genre;
    private String description;
    private String daterelease;
    private String rating;
    private String duration;
    private String url;
    private int imagePath;

    public FilmEntity(String filmId, String title, String genre, String description, String daterelease, String rating, String duration, String url, int imagePath) {
        this.filmId = filmId;
        this.title = title;
        this.genre = genre;
        this.description = description;
        this.daterelease = daterelease;
        this.rating = rating;
        this.duration = duration;
        this.url = url;
        this.imagePath = imagePath;
    }

    public String getFilmId() {
        return filmId;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }

    public String getDaterelease() {
        return daterelease;
    }

    public String getRating() {
        return rating;
    }

    public String getDuration() {
        return duration;
    }

    public String getUrl() {
        return url;
    }

    public int getImagePath() {
        return imagePath;
    }
}
