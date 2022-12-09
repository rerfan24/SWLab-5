package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Movies implements Cloneable{
    private List<String> movies;

    public Movies() {
        movies = new ArrayList<String>();
    }

    public Movies(List<String> movies) {
        this.movies = movies;
    }

    public void loadData() {
        movies.add("Black Panther 2");
        movies.add("The Menu");
        movies.add("Violent Night");
    }

    public List<String> getMoviesList() {
        return movies;
    }

    public void removeMovie(String movie) {
        movies.remove(movie);
    }

    public void addMovie(String movie){
        movies.add(movie);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>(this.getMoviesList());
        return new Movies(temp);
    }
}
