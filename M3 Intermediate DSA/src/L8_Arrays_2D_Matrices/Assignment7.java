package L8_Arrays_2D_Matrices;

public class Assignment7 {

  void reverse(int[] A) {
    int N = A.length;
    int index = 0;
    int jIndex = N-1;

    while (index < jIndex) {
      int temp = A[index];
      A[index] = A[jIndex];
      A[jIndex] = temp;
      index++;
      jIndex--;
    }
  }

  public void solve(int[][] A) {
    int N = A.length;

    for (int row = 0; row < N -1; row++) {
      for (int col = row + 1; col < N; col++ ) {
        int tmp = A[row][col];
        A[row][col] = A[col][row];
        A[col][row] = tmp;
      }
    }

    for (int[] row : A) {
      reverse(row);
    }
  }

}
