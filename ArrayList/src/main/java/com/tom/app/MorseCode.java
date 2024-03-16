package com.tom.app;

import java.util.HashSet;

/**
 * MorseCode
 */
public class MorseCode {

  public int uniqueMorseRepresentations(String[] words) {
    HashSet<String> unique_codes = new HashSet<>();

    String[] MORSE = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
        "....", "..", ".---", "-.-", ".-..", "--", "-.",
        "---", ".--.", "--.-", ".-.", "...", "-", "..-",
        "...-", ".--", "-..-", "-.--", "--.." };

    for (String word : words) {
      StringBuilder transformation = new StringBuilder();

      for (char c : word.toCharArray()) {
        transformation.append(MORSE[c - 'a']);
      }

      unique_codes.add(transformation.toString());
    }

    return unique_codes.size();
  }

}
