package ru.netology.manager.manager;

import org.junit.jupiter.api.Test;
import ru.netology.manager.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
    private Movie one = new Movie(1, "one1", "name1", "01.01.2022" ,"Url1", "horror");
    private Movie two = new Movie(2, "two2", "name2", "02.01.2022" ,"Url2", "parody");
    private Movie three = new Movie(3, "tree3", "name3", "03.01.2022" ,"Url3", "western");
    private Movie four = new Movie(4, "four4", "name4", "04.01.2022" ,"Url4", "thriller");
    private Movie five = new Movie(5, "five5", "name5", "05.01.2022" ,"Url5", "action");
    private Movie six = new Movie(6, "six6", "name6", "06.01.2022" ,"Url6", "romance");
    private Movie seven = new Movie(7, "seven7", "name7", "07.01.2022" ,"Url7", "drama");
    private Movie eight = new Movie(8, "eight8", "name8", "08.01.2022" ,"Url8", "mystery");
    private Movie nine = new Movie(9, "nine9", "name9", "09.01.2022" ,"Url9", "detective");
    private Movie ten = new Movie(10, "ten10", "name10", "10.01.2022" ,"Url10", "comedy");

    @Test
    public void shouldAddMovie() {

    }

    @Test
    void viewAllMovie() {
    }
}