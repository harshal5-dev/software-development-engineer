package L6_Arrays_Carry_Forward;

import java.util.ArrayList;

public class Assignment2 {

  public int[] solve(int[] A) {
    int N = A.length;
    int maxValue = A[N-1];
    ArrayList<Integer> ans = new ArrayList<>();
    ans.add(A[N-1]);

    for (int index = N -2; index >= 0; index--) {

      if (A[index] > maxValue) {
        maxValue = A[index];
        ans.add(A[index]);
      }

    }

    return ans.stream().mapToInt(i -> i).toArray();
  }
}
