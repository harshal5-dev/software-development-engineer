package L10_Interview_Problems_on_Arrays;

public class Assignment1 {

  public int[] solve(int[] A, int[][] B) {
    int N = A.length;
    int M = B.length;
    int[] ans = new int[M];
    int[] prefixEven = new int[N];

    prefixEven[0] = A[0];

    for (int index = 1; index < N; index++) {
      prefixEven[index] = prefixEven[index - 1] + ((index & 1) == 0 ? A[index] : 0);
    }

    for (int index = 0; index < M; index++) {
      int left = B[index][0];
      int right = B[index][1];
      int sum = prefixEven[right];

      if (left > 0) {
        sum -= prefixEven[left - 1];
      }

      ans[index] = sum;
    }

    return ans;
  }
}
