package L10_Interview_Problems_on_Arrays;

public class Assignment3 {

  public int solve(int[] A) {
    int N = A.length;
    int[] prefixEven = new int[N];
    int[] prefixOdd = new int[N];
    int ans = 0;

    prefixEven[0] = A[0];

    for (int index = 1; index < N; index++) {
      if ((index & 1) == 0) {
        prefixEven[index] = prefixEven[index - 1] + A[index];
        prefixOdd[index] = prefixOdd[index - 1];
      } else {
        prefixOdd[index] = prefixOdd[index - 1] + A[index];
        prefixEven[index] = prefixEven[index - 1];
      }
    }

    if (prefixOdd[N-1] - prefixOdd[0] == prefixEven[N-1] - prefixEven[0]) {
      ans++;
    }

    for (int index = 1; index < N; index++) {
      int sumEven = prefixEven[index - 1] + prefixOdd[N-1] - prefixOdd[index];
      int sumOdd = prefixOdd[index - 1] + prefixEven[N-1] - prefixEven[index];

      if (sumEven == sumOdd) {
        ans++;
      }
    }

    return ans;
  }
}
