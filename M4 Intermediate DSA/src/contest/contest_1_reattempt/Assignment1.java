package contest.contest_1_reattempt;

public class Assignment1 {

  public int solve(int[] A) {
    int N = A.length;
    int descCount = 1;
    int ans = 1;

    for (int index = 1; index < N; index++) {
      if (A[index] < A[index - 1]) {
        descCount++;
        ans = Math.max(ans, descCount);
      } else {
        descCount = 1;
      }
    }

    return ans;
  }
}
