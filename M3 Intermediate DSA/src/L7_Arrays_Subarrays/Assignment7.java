package L7_Arrays_Subarrays;

public class Assignment7 {

  public int[][] solve(int[] A) {
    int N = A.length;
    int size = N * (N + 1) / 2;
    int[][] ans = new int[size][];
    int ansIndex = 0;

    for (int index = 0; index < N; index++) {
      for (int jIndex = index; jIndex < N; jIndex++) {
        int[] subArray = new int[jIndex - index + 1];
        int subArrayIndex = 0;

        for (int kIndex = index; kIndex <= jIndex; kIndex++) {
          subArray[subArrayIndex] = A[kIndex];
          subArrayIndex++;
        }

        ans[ansIndex] = subArray;
        ansIndex++;
      }
    }

    return ans;
  }

}
