package L5_Arrays_Prefix_Sum;

public class Assignment4 {

  public int[] solve(int[] A) {
    for (int index = 1; index < A.length; index++) {
      A[index] = A[index-1] + A[index];
    }
    return A;
  }

}
