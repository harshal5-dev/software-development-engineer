package L14_Sorting;

import java.util.Arrays;

public class Assignment1 {

  public int solve(int[] A) {
    int N = A.length;
    int ans = 0;

    Arrays.sort(A);

    for (int index = N-1; index >= 0; index--) {
      ans += A[index] * (N - index);
    }

    return ans;
  }

}
