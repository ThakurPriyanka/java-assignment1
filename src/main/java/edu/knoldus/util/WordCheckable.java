package edu.knoldus.util;

import java.util.List;

@FunctionalInterface
public interface WordCheckable {
  public List<List<CountParameter>> wordCheck(String[] word);
}
