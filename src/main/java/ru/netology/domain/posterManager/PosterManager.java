package ru.netology.domain.posterManager;

public class PosterManager {
    private String[] movies = new String[0];
    private int movieLimit;

    public PosterManager() {

        movieLimit = 10;
    }

    public PosterManager(int movieLimit) {

        this.movieLimit = movieLimit;
    }

    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {

        return movies;
    }

    public String[] findLast() {

        int resultLength;
        if (movieLimit < movies.length) {
            resultLength = movieLimit;
        } else {
            resultLength = movies.length;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}