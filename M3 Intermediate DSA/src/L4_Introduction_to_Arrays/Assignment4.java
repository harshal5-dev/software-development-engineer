package L4_Introduction_to_Arrays;

public class Assignment4 {

  public int[] solve(final int[] A) {
    int N = A.length;
    int[] ans = new int[N];

    for (int index = 0; index < N; index++) {
      ans[index] = A[N-1-index];
    }

    return ans;
  }

}
