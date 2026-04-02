package L4_Introduction_to_Arrays;

public class Assignment3 {

  public int[] solve(int[] A, int B, int C) {
    int index = B;
    int jIndex = C;

    while (index < jIndex) {
      int tmp = A[index];
      A[index] = A[jIndex];
      A[jIndex] = tmp;
      index++;
      jIndex--;
    }

    return A;
  }

}
