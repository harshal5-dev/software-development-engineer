package L8_Arrays_2D_Matrices;

public class Assignment6 {

  public int[][] solve(int[][] A) {
    int N = A.length;
    int M = A[0].length;
    int[][] ans = new int[M][N];

    for (int col = 0; col < M; col++) {
      for (int row = 0; row < N; row++) {
        ans[col][row] = A[row][col];
      }
    }

    return ans;
  }
}
