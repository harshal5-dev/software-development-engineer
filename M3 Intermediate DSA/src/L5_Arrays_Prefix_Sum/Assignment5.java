package L5_Arrays_Prefix_Sum;

public class Assignment5 {

  public int solve(int[] A) {
    int N = A.length;
    int[] prefixSum = new int[N];

    prefixSum[0] = A[0];

    for (int index = 1; index < N; index++) {
      prefixSum[index] = prefixSum[index - 1] + A[index];
    }

    if (prefixSum[N - 1] - prefixSum[0] == 0) {
      return 0;
    }

    for (int index = 1; index < N ;index++) {
      int leftSum = prefixSum[index -1];
      int rightSum = prefixSum[N-1] - prefixSum[index];

      if (leftSum == rightSum) {
        return index;
      }
    }

    return -1;
  }

}
