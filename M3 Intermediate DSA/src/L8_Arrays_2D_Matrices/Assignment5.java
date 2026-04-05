package L8_Arrays_2D_Matrices;

public class Assignment5 {

  public int[][] diagonal(int[][] A) {
    int N = A.length;
    int[][] ans = new int[2 * N -1][N];
    int ansRowIndex = 0;

    for (int col = 0; col < N; col++) {
      int x = 0;
      int y = col;
      int ansColIndex = 0;

      while (x < N && y >= 0) {
        ans[ansRowIndex][ansColIndex] = A[x][y];
        x++;
        y--;
        ansColIndex++;
      }

      ansRowIndex++;
    }

    for (int row = 1; row < N; row++) {
      int x = row;
      int y = N - 1;
      int ansColIndex = 0;

      while (x < N && y >= 0) {
        ans[ansRowIndex][ansColIndex] = A[x][y];
        x++;
        y--;
        ansColIndex++;
      }

      ansRowIndex++;
    }

    return ans;
  }
}
