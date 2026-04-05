package L8_Arrays_2D_Matrices;

public class Assignment2 {

  public int[] solve(int[][] A) {
    int N = A.length;
    int M = A[0].length;
    int[] ans = new int[N];

    for (int row = 0; row < N; row++) {
      int sum = 0;
      for (int col = 0; col < M; col++) {
        sum += A[row][col];
      }

      ans[row] = sum;
    }

    return ans;
  }

}
