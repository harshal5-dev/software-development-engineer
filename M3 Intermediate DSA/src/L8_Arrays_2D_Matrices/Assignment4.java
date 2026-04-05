package L8_Arrays_2D_Matrices;

public class Assignment4 {

  public int solve(final int[][] A) {
    int N = A.length;
    int col = N - 1;
    int row = 0;
    int ans = 0;

    while (row < N) {
      ans += A[row][col];
      row++;
      col--;
    }

    return ans;
  }

}
