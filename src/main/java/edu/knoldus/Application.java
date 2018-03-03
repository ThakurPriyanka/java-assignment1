package edu.knoldus;

import edu.knoldus.operation.MovieOpertion;
import edu.knoldus.operation.Operation;
import edu.knoldus.util.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Application {
  public static void main(String[] args) {
    Logger log = Logger.getLogger(Application .class.getName());
    List<Integer> numberList = new ArrayList<>();
    Operation operationObject = new Operation();
    for (int i = 0; i < 10; i++) {
      numberList.add(operationObject.generateNumber(20, 1));
    }
   log.info(operationObject.findPrimeNumber(numberList).toString());
    String path = "src/main/resources/file.txt";
    log.info(operationObject.wordCountInFile(path).toString());
    String sentence = "My name is Priyanka. This is a good day";
    log.info(operationObject.countWordInSentence(sentence).toString());
    List<Integer> inputList1 = new ArrayList<>();
    List<Integer> inputList2 = new ArrayList<>();
    for (int i = 0; i < 4; i++) {
      inputList1.add(operationObject.generateNumber(20, 1));
    }
    for (int i = 0; i < 6; i++) {
      inputList2.add(operationObject.generateNumber(20, 1));
    }
    log.info(inputList1.toString());
    log.info(inputList2.toString());

    log.info(operationObject.multiTwoList(inputList1, inputList2).toString());
    List<Movie> movieList = new ArrayList<>();

    Movie movie1 = new Movie("insidious", "2006", "scary", 9);
    Movie movie2 = new Movie("Golmaal", "2017", "comedy", 9);
    Movie movie3 = new Movie("doctor Strange", "2005", "sci-fic", 7);
    Movie movie4 = new Movie("hera phere", "2017", "comedy", 5);
    Movie movie5 = new Movie("English Vinglish", "2016", "comedy", 8);
    movieList.add(movie1);
    movieList.add(movie2);
    movieList.add(movie3);
    movieList.add(movie4);
    movieList.add(movie5);

    MovieOpertion movieOpertionObject = new MovieOpertion();

    log.info(movieOpertionObject.filterByRating(movieList).toString());

    log.info(movieOpertionObject.filterByEvenRating(movieList).toString());

    log.info(movieOpertionObject.filterByYear(movieList).toString());

    log.info(movieOpertionObject.filterMovie(movieList).toString());
  }
}
