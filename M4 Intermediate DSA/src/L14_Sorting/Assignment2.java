package L14_Sorting;

import java.util.Arrays;

public class Assignment2 {


  public int solve(int[] A) {
    int N = A.length;

    Arrays.sort(A);

    if (A[N - 1] == 0) {
      return 1;
    }

    int count = 0;

    for (int index = N - 2; index >= 0; index--) {
      if (A[index] != A[index + 1]) {
        count = N - index - 1;
      }

      if (A[index] == count) {
        return 1;
      }


    }
    return -1;
  }
}
