package edu.knoldus.util;


public class Movie {
  String name, genre, releaseYear;
  Integer rating;

  public Movie(String name, String releaseYear, String genre, Integer rating) {
    this.name = name;
    this.releaseYear = releaseYear;
    this.genre = genre;
    this.rating = rating;
  }

  public String toString() {
    return this.name + " " + this.releaseYear + " " + this.genre + " " + this.rating;
  }

  public void setName(String name) {

    this.name = name;
  }

  public void setReleaseYear(String releaseYear) {
    this.releaseYear = releaseYear;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }

  public String getName() {

    return name;
  }

  public String getReleaseYear() {
    return releaseYear;
  }

  public String getGenre() {
    return genre;
  }

  public Integer getRating() {
    return rating;
  }
}
