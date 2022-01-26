package ru.netology.manager.manager;

import ru.netology.manager.domain.Movie;

public class MovieManager {
    private Movie[] movies = new Movie[0];
    private int numberOfMovie;

    public MovieManager(int numberOfMovie) {
        this.numberOfMovie = 10;
    }

    public MovieManager() {
    }

    public void addMovie (Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp =new Movie[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        int lastMovie = tmp.length - 1;
        tmp[lastMovie] = movie;
        movies = tmp;

    }

    public Movie[] lastMovie (int numberOfMovie) {
        if (movies.length < numberOfMovie) {
            Movie[] result = new Movie[movies.length];
            for (int i = 0; i < result.length; i++) {
                int index = movies.length - i - 1;
                result[i] = movies[index];
            }
            return result;
        } else {
            Movie[] result = new Movie[numberOfMovie];
            for (int i = 0; i < result.length; i++) {
                int index = movies.length - i - 1;
                 result[i] = movies[index];
            }
            return result;
        }
    }
    public Movie[] findAll() {
        return movies;
    }
}
