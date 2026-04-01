package L1_Introduction_to_Problem_Solving;

public class Assignment1 {

  public int solve(int A) {
    int ans = 0;

    for (int num = 1; num * num <= A; num++) {
      if (A % num == 0) {
        ans += num * num == A ? 1 : 2;
      }
    }

    return ans;
  }

}
