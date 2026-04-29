package L14_Sorting;

import java.util.ArrayList;

public class Assignment4 {

  public int checkLargest(Integer a, Integer b) {
    String s1 = a + Integer.toString(b);
    String s2 = b + Integer.toString(a);

    return s2.compareTo(s1);
  }

  public String largestNumber(ArrayList<Integer> A) {
    StringBuilder ans  = new StringBuilder();

    A.sort(this::checkLargest);

    if (A.getFirst() == 0) {
      return  "0";
    }

    for (Integer num : A) {
      ans.append(num);
    }

    return ans.toString();
  }
}
