package L10_Interview_Problems_on_Arrays;

public class Assignment2 {

  public int[] solve(int[] A, int[][] B) {
    int N = A.length;
    int M = B.length;
    int[] ans = new int[M];
    int[] prefixOdd = new int[N];

    for (int index = 1;index < N; index++) {
      prefixOdd[index] = prefixOdd[index - 1] + ((index & 1) == 1 ? A[index] : 0);
    }

    for (int index = 0; index < M; index++) {
      int left = B[index][0];
      int right = B[index][1];
      int sum = prefixOdd[right];

      if (left > 0) {
        sum -= prefixOdd[left - 1];
      }

      ans[index] = sum;
    }

    return ans;
  }

}
