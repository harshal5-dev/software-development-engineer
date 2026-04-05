package L9_Arrays_Sliding_Window;

public class Assignment2 {

  public int solve(int[] A, int B) {
    int N = A.length;
    int K = 0;

    for (int el: A) {
      if (el <= B) {
        K++;
      }
    }

    if (K == 0 || K == 1 || K == N) {
      return 0;
    }

    int badElements = 0;

    for (int index = 0; index < K; index++) {
      if (A[index] > B) {
        badElements++;
      }
    }

    int s = 1;
    int e = K;
    int ans = badElements;

    while (e < N) {
      if (A[s-1] > B) {
        badElements--;
      }
      if (A[e] > B) {
        badElements++;
      }

      ans = Math.min(ans, badElements);
      e++;
      s++;
    }

    return ans;
  }

}
