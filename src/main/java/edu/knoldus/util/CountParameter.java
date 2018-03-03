package edu.knoldus.util;

public class CountParameter {
  String word;
  Integer count;


  public CountParameter(String word, Integer count) {
    this.word = word;
    this.count = count;
  }

  public void setWord(String word) {
    this.word = word;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public String getWord() {
    return word;
  }

  public Integer getCount() {
    return count;
  }
  public String toString() {
    return "\""+this.word+"\" "+this.count;
  }
}
