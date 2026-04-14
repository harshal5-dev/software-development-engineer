package L13_Maths_Modular_Arthimetic_Introduction;

public class Assignment3 {

  public int solve(int[] A) {
    int sum = 0;

    for (int ele: A) {
      sum += ele;
    }

    if (sum % 3 == 0) {
      return 1;
    }

    return 0;
  }

}
