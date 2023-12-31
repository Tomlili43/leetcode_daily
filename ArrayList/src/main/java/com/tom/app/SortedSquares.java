package com.tom.app;

public class SortedSquares {
  public int[] sortedSquares(int[] A) {
    int N = A.length;
    int positive_pointer = 0;

    while (positive_pointer < N && A[positive_pointer] < 0) {
      positive_pointer += 1;
    }

    int negative_pointer = positive_pointer - 1;

    int[] res = new int[N];
    int count = 0;

    while (negative_pointer >= 0 && positive_pointer <= N - 1) {
      int dif = A[negative_pointer] * A[negative_pointer] - A[positive_pointer] * A[positive_pointer];
      if (dif <= 0) {
        res[count] = A[negative_pointer] * A[negative_pointer];
        negative_pointer -= 1;
      } else {
        res[count] = A[positive_pointer] * A[positive_pointer];
        positive_pointer += 1;
      }
      count++;
    }
    while (negative_pointer >= 0) {
      res[count] = A[negative_pointer] * A[negative_pointer];
      count++;
      negative_pointer--;
    }
    while (positive_pointer <= N - 1) {
      res[count] = A[positive_pointer] * A[positive_pointer];
      count++;
      positive_pointer++;
    }

    return res;
  }
}
