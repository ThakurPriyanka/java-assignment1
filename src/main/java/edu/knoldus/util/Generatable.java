package edu.knoldus.util;

import java.util.List;

@FunctionalInterface
public interface Generatable {
  List<Integer> generate(List<Integer> inputList);
}
