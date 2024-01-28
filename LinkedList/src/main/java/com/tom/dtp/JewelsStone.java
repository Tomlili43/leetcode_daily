package com.tom.dtp;

/**
 * JewelsStone
 */
public class JewelsStone {
  public int numJewelsInStones(String J, String S) {
    int num_jew = 0;

    for (int i = 0; i < S.length(); i++) {
      if (J.indexOf(S.charAt(i)) > -1) {
        num_jew++;
      }
    }
    return num_jew;
  }
}
