package L4_Introduction_to_Arrays;

public class Assignment1 {
  public int solve(int[] A) {
    int ans = 0;
    int maxValue = 0;
    int N = A.length;

    for (int i : A) {
      maxValue = Math.max(maxValue, i);
    }

    for (int i : A) {
      if (i != maxValue) {
        ans++;
      }
    }

    return ans;
  }
}
