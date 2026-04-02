package L4_Introduction_to_Arrays;

public class Assignment5 {

  void reverse(int[] A, int B, int C) {
    int index = B;
    int jIndex = C;

    while (index < jIndex) {
      int tmp = A[index];
      A[index] = A[jIndex];
      A[jIndex] = tmp;

      index++;
      jIndex--;
    }

  }

  public int[] solve(int[] A, int B) {
    int N = A.length;
    B = B % N;

    reverse(A, 0, N -1);
    reverse(A, 0, B-1);
    reverse(A, B, N-1);

    return A;
  }

}
