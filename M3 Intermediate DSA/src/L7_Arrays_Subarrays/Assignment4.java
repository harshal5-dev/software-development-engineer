package L7_Arrays_Subarrays;

public class Assignment4 {

  public int[] solve(int[] A, int B, int C) {
    int[] ans = new int[C - B + 1];
    int ansIndex = 0;

    for (int index = B; index <= C; index++) {
      ans[ansIndex] =  A[index];
      ansIndex++;
    }

    return ans;
  }

}
