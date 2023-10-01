package com.dsa.handson.one.solution;

import com.dsa.handson.util.ReadTextFile;

class Solution {

  public static void main(String[] args) {
    String filePath = "src/com/dsa/handson/one/data/SampleInput.txt";
    String input = ReadTextFile.read(filePath);
    System.out.println(input);
  }
}