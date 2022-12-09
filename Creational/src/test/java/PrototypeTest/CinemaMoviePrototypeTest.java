package PrototypeTest;

import Prototype.Movies;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class CinemaMoviePrototypeTest {
    private Movies released;

    @Before
    public void setUp() {
        released = new Movies();
        released.loadData();
    }

    @Test
    public void removeMovieTest() throws CloneNotSupportedException{
        Movies cinemaAzadi = (Movies) released.clone();
        cinemaAzadi.removeMovie("Black Panther 2");
        Assert.assertFalse(cinemaAzadi.getMoviesList().contains("Black Panther 2"));
        Assert.assertTrue(released.getMoviesList().contains("Black Panther 2"));
    }

    @Test
    public void addMovieTest() throws CloneNotSupportedException{
        Movies cinemaPardis = (Movies) released.clone();
        cinemaPardis.addMovie("Titanic");
        Assert.assertTrue(cinemaPardis.getMoviesList().contains("Titanic"));
        Assert.assertFalse(released.getMoviesList().contains("Titanic"));
    }
}
