package L6_Arrays_Carry_Forward;

public class Assignment3 {

  public int solve(int[] A) {
    int N = A.length;
    int minValue = Integer.MAX_VALUE;
    int maxValue = Integer.MIN_VALUE;

    for (int element : A) {
      minValue = Math.min(minValue, element);
      maxValue = Math.max(maxValue, element);
    }

    if (minValue == maxValue) {
      return 1;
    }

    int ans = N;
    int maxIndex = -1;
    int minIndex = -1;

    for (int index = N-1; index >= 0; index--) {

      if (A[index] == maxValue) {
        maxIndex = index;

        if (minIndex != -1) {
          int len = minIndex - maxIndex + 1;
          ans = Math.min(ans, len);
        }

      } else if (A[index] == minValue) {
        minIndex = index;

        if (maxIndex != -1) {
          int len = maxIndex - minIndex + 1;
          ans = Math.min(ans, len);
        }
      }

    }

    return ans;
  }

}
