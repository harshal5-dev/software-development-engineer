package L5_Arrays_Prefix_Sum;

public class Assignment6 {

  public int[] solve(int[] A, int[][] B) {
    int N = A.length;
    int M = B.length;
    int[] ans = new int[M];
    int[] prefixSum = new int[N];

    prefixSum[0] = (A[0] & 1) == 0 ? 1 : 0;

    for (int index = 1; index < N; index++) {
      prefixSum[index] = prefixSum[index-1] + ((A[index] & 1) == 0 ? 1 : 0);
    }

    for (int index = 0; index < M; index++) {
      int left = B[index][0];
      int right = B[index][1];

      int count = prefixSum[right];

      if (left > 0) {
        count -= prefixSum[left-1];
      }

      ans[index] = count;
    }

    return ans;
  }
}
