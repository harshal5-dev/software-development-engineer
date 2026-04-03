package L5_Arrays_Prefix_Sum;

public class Assignment3 {

  public long[] rangeSum(int[] A, int[][] B) {
    int N = A.length;
    int M = B.length;
    long[] prefixSum = new long[N];
    long[] ans = new long[M];
    prefixSum[0] = A[0];

    for (int index = 1; index < N;index++) {
      prefixSum[index] = prefixSum[index-1] + A[index];
    }

    for (int index = 0; index < M; index++) {
      int left = B[index][0];
      int right = B[index][1];

      long sum = prefixSum[right];

      if (left > 0) {
        sum -= prefixSum[left-1];
      }

      ans[index] = sum;
    }

    return ans;
  }
}
