package L14_Sorting;

import java.util.ArrayList;

public class Assignment3 {

  int countFactors(int A) {
    int count = 0;

    for (int num = 1; num * num <= A; num++) {
      if (A % num == 0) {
        count +=num * num == A ? 1 : 2;
      }
    }

    return count;
  }

  public ArrayList<Integer> solve(ArrayList<Integer> A) {

    A.sort((obj1 ,  obj2) -> {
      int aFactor = countFactors(obj1);
      int bFactor = countFactors(obj2);

      return aFactor == bFactor ? obj1 - obj2 : aFactor - bFactor;
    });

    return A;
  }
}
