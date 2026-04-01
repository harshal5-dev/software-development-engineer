package L1_Introduction_to_Problem_Solving;

public class Assignment3 {

  public int solve(int A) {

    for (int num =1; num * num <= A; num++) {
      if (num * num == A) {
        return num;
      }
    }

    return -1;
  }
}
