package com.dsa.handson.four.solution;

import com.dsa.handson.util.ReadTextFile;

class Solution {
  public static void main(String[] args) {
    String filePath = "src/com/training/hard/problem1/static/ActualInput.txt";
    String input = ReadTextFile.read(filePath);
    System.out.println(input);
  }
}