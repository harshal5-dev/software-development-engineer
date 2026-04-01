package L1_Introduction_to_Problem_Solving;

public class Assignment2 {


  public int solve(long A) {
    int count = 0;

    for (long num = 1L; num * num <= A; num++) {
      if (A % num == 0) {
        count += num * num == A ? 1 : 2;

        if (count > 2) {
          return 0;
        }
      }
    }

    return count == 2 ? 1 : 0;
  }

}
