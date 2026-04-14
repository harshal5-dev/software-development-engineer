package L13_Maths_Modular_Arthimetic_Introduction;

public class Assignment1 {

  public int solve(int A, int B, int C)  {
    long ans = 1;

    for (int num = 1; num <= B; num++) {
      ans = ((ans % C) * (A % C)) % C;
    }

    return (int) ans;
  }

}
