package L9_Arrays_Sliding_Window;

public class Assignment3 {

  int printBoundary(int[][] A, int row, int col, int N, int val) {
    if (N == 1) {
      A[row][col] = val;
      return val;
    }


    for (int index = 1; index < N; index++) {
      A[row][col] = val;
      col++;
      val++;
    }

    for (int index = 1; index < N; index++) {
      A[row][col] = val;
      row++;
      val++;
    }

    for (int index = 1; index < N; index++) {
      A[row][col] = val;
      col--;
      val++;
    }

    for (int index = 1; index < N; index++) {
      A[row][col] = val;
      row--;
      val++;
    }

    return val;
  }

  public int[][] generateMatrix(int A) {
    int[][] ans = new int[A][A];
    int row = 0;
    int col = 0;
    int val = 1;

    while (A > 0) {
      val = printBoundary(ans, row, col, A, val);
      row++;
      col++;
      A -= 2;
    }

    return ans;
  }

}
