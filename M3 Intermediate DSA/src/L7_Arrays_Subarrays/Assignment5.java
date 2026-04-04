package L7_Arrays_Subarrays;

public class Assignment5 {

  public int maxSubArray(int A, int B, int[] C) {
    int ans = Integer.MIN_VALUE;

    for (int index = 0; index < A; index++) {
      int sum = 0;
      for (int jIndex = index; jIndex < A; jIndex++) {
        sum += C[jIndex];

        if (sum > B) {
          sum -= C[jIndex];
          break;
        }
      }

      ans = Math.max(ans, sum);
    }

    return ans;
  }

}
