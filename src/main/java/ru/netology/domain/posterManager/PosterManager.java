package ru.netology.domain.posterManager;

public class PosterManager {
    public String[] movies = new String[0];
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
        } else{
            resultLength = movies.length;
        }
  String[] result = new String[resultLength];
        for (int i = 0; i < movieLimit; i++) {
            result[i] = movies[movies.length - 1 - i];
            // заполняем result из массива что лежит в поле
            // в обратном порядке
        }
        return result;
    }
}