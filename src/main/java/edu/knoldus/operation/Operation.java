package edu.knoldus.operation;

import edu.knoldus.util.CountParameter;
import edu.knoldus.util.Generatable;
import edu.knoldus.util.WordCheckable;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Operation {

  public  int generateNumber(int max, int min) {
    Random r = new Random();
    return r.nextInt((max - min) + 1) + min;
  }

 public List<Integer> findPrimeNumber(List<Integer> numberList) {
    Generatable generatable = ((List<Integer> inputNumberList) -> {
      List<Integer> primeList = new ArrayList<>();
     for (Integer number: inputNumberList) {
        if (number % 2 == 0) {
          primeList.add(number);
      }
    }
      return primeList;
    });
    return generatable.generate(numberList);
  }


  public Map<String, Integer> wordCountInFile(String path) {
    BufferedReader bufferedReader = null;
    Map<String, Integer> wordList = new HashMap<>();

    try {
      bufferedReader = new BufferedReader(new FileReader(path));
      String sCurrentLine;

      while ((sCurrentLine = bufferedReader.readLine()) != null) {
        String[] listOfWord = (sCurrentLine.split(" "));
        for (String word: listOfWord) {
          if (wordList.containsKey(word)) {
            Integer count = wordList.get(word);
            wordList.replace(word, ++count);

          } else {
            wordList.putIfAbsent(word, 1);
          }
        }
      }
      return wordList;
    }
    catch(FileNotFoundException fe) {
      fe.getMessage();
    }
    catch (IOException e) {

      e.printStackTrace();

    }
    return wordList;
  }

  public List<List<CountParameter>> countWordInSentence(String sentence) {
    String[] wordList = sentence.split(" ");
    WordCheckable wordCheck = (String[] wordListSeq) -> {
      List<List<CountParameter>> sentenceCount =  new ArrayList<>();
      boolean flag=true;
      for(String word: wordListSeq) {
        for(List<CountParameter> innerWordList : sentenceCount) {
          if(word.compareTo(innerWordList.get(0).getWord()) == 0){
            Integer count = innerWordList.get(0).getCount();
              innerWordList.get(0).setCount(++count);
              flag = false;
              break;
          }
          else {
            flag = true;
          }
        }
        if(flag==true) {
          CountParameter countParameter = new CountParameter(word, 1);
          List<CountParameter> newWordCount = new ArrayList<>();
          newWordCount.add(countParameter);
          sentenceCount.add(newWordCount);
          flag = false;
        }
      }
      return sentenceCount;
    };
    return wordCheck.wordCheck(wordList);
  }

public List<Integer> multiTwoList(List<Integer> inputList1, List<Integer> inputList2) {
    List<Integer> resultList = new ArrayList<>();
    if(inputList1.size() < inputList2.size()) {
      for (int index = 0; index < inputList1.size(); index++) {
        resultList.add(inputList1.get(index) * inputList2.get(index));
      }
      for (int index = inputList1.size(); index < inputList2.size(); index++) {
        resultList.add(inputList2.get(index));
      }

    }

  else if(inputList1.size() > inputList2.size()) {
    for (int index = 0; index < inputList2.size(); index++) {
      resultList.add(inputList1.get(index) * inputList2.get(index));
    }
    for (int index = inputList2.size(); index < inputList1.size(); index++) {
      resultList.add(inputList1.get(index));
    }

  }
  else{
    for (int index = 0; index < inputList2.size(); index++) {
      resultList.add(inputList1.get(index) * inputList2.get(index));
    }
  }
   return resultList;
}
}