package ru.netology.domain.posterManager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {

    String movie1 = "Бладшот";
    String movie2 = "Вперед";
    String movie3 = "Отель Белград";
    String movie4 = "Джентльмены";
    String movie5 = "Человек-невидимка";
    String movie6 = "Тролли. Мировой тур";
    String movie7 = "Номер один";
    String movie8 = "Монстры на каникулах";
    String movie9 = "Зверополис";
    String movie10 = "Зверопой";
    String movie11 = "Головоломка";

    @Test
    public void shouldAddMovies() {

        PosterManager manager = new PosterManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);

        String[] expected = {movie1, movie2, movie3};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindMovies() {

        PosterManager manager = new PosterManager(6);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);

        String[] expected = {movie1, movie2, movie3, movie4, movie5, movie6};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastEqualsLimit() {
        PosterManager manager = new PosterManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);

        String[] expected = {movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastUnderLimit() {
        PosterManager manager = new PosterManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);

        String[] expected = {movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastOverLimit() {
        PosterManager manager = new PosterManager(11);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);
        manager.addMovie(movie11);

        String[] expected = {movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseFiveMovies() {
        PosterManager manager = new PosterManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);

        String[] expected = {movie5, movie4, movie3, movie2, movie1};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }
}