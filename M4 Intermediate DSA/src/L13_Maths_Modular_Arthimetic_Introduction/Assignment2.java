package L13_Maths_Modular_Arthimetic_Introduction;

public class Assignment2 {

  public int solve(int[] A, int B) {
    long ans = 0;
    int N = A.length;
    long pow = 1;

    for (int index = N -1; index >= 0; index--) {
      int digit = A[index];
      long term = (digit * pow) % B;
      ans = ((ans % B) + (term % B)) % B;
      pow = (pow * 10) % B;
    }

    return (int)ans;
  }

}
