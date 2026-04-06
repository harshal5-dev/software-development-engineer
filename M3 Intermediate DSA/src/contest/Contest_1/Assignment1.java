package contest.Contest_1;

public class Assignment1 {

  public int solve(int[] A) {
    int ans = 0;
    int longestStretch = 0;

    for (int ele: A) {
      if ((ele & 1) == 1) {
        longestStretch++;
        ans = Math.max(ans, longestStretch);
      } else {
        longestStretch = 0;
      }
    }

    return ans;
  }

}
