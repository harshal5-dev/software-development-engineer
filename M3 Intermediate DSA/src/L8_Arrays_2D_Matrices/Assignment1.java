package L8_Arrays_2D_Matrices;

public class Assignment1 {

  public int[] solve(int[][] A) {
    int N = A.length;
    int M = A[0].length;
    int[] ans = new int[M];

    for (int col = 0; col < M;col++) {
      int sum = 0;
      for (int row = 0; row < N; row++) {
        sum += A[row][col];
      }
      ans[col] = sum;
    }

    return ans;
  }

}
