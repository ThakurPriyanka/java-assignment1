package edu.knoldus.operation;

import edu.knoldus.util.Movie;

import java.util.Date;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class MovieOpertion {

  public List<Movie> filterByRating(List<Movie> movieList) {
    return movieList.stream().filter(movie -> movie.getRating() > 8 && movie.getGenre().equals("comedy")).collect(toList());
  }

    public  List<Movie> filterByYear(List<Movie> movieList) {
       return movieList.stream().filter(movie -> movie.getReleaseYear().compareTo("2000") > 0 && movie.getRating() < 8).collect(toList());
  }
  public List<Movie> filterByEvenRating(List<Movie> movieList) {
    return movieList.stream().filter(movie -> movie.getRating() % 2 == 0).collect(toList());
  }

  public List<Movie> filterMovie(List<Movie> movieList) {
    return movieList.stream().filter(movie -> movie.getRating() == 7 && movie.getGenre().equals("sci-fic")).collect(toList());
  }
}
