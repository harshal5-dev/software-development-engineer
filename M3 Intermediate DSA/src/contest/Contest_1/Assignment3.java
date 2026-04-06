package contest.Contest_1;

public class Assignment3 {

  public int[] solve(int[] A, int[][] B) {
    int N = A.length;
    int M = B.length;
    int[] ans = new int[M];
    int[] prefixCount = new int[N];

    prefixCount[0] = A[0] % 5 == 0 ? 1 : 0;

    for (int index = 1; index < N; index++) {
      prefixCount[index] = prefixCount[index - 1] + (A[index] % 5 == 0 ? 1 : 0);
    }

    for (int index = 0; index < M; index++) {
      int left = B[index][0];
      int right = B[index][1];
      int count = prefixCount[right];

      if (left > 0) {
        count -= prefixCount[left-1];
      }

      ans[index] = count;
    }

    return ans;
  }

}
