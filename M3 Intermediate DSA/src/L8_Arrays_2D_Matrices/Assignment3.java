package L8_Arrays_2D_Matrices;

public class Assignment3 {

  public int solve(final int[][] A) {
    int N = A.length;
    int index = 0;
    int ans = 0;

    while (index < N) {
      ans += A[index][index];
      index++;
    }

    return ans;
  }

}
