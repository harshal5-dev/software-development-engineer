package L9_Arrays_Sliding_Window;

public class Assignment1 {

  public int solve(int[] A, int B, int C) {
    int N = A.length;
    int sum = 0;

    for (int index = 0; index < B; index++) {
      sum += A[index];
    }

    if (sum == C) {
      return 1;
    }

    int s = 1;
    int e = B;

    while (e < N) {
      sum = sum - A[s-1] +  A[e];

      if (sum == C) {
        return 1;
      }

      s++;
      e++;
    }

    return 0;
  }

}
