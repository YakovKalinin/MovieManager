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

    public void addMovie(Movie movie) {
        Movie[] tmp = new Movie[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;

    }

    public Movie[] lastMovie(int numberOfMovie) {
        if (movies.length < numberOfMovie) {
            Movie[] result = new Movie[movies.length];
            for (int i = 0; i < result.length; i++) {
                result[i] = movies[movies.length - i - 1];
            }
            return result;
        } else {
            {
                Movie[] result = new Movie[numberOfMovie];
                for (int i = 0; i < result.length; i++) {
                    result[i] = movies[movies.length - i - 1];
                }
                return result;
            }
        }
    }


    public Movie[] findAll() {
        return movies;
    }
}
