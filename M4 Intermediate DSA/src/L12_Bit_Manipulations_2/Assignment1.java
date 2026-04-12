package L12_Bit_Manipulations_2;

public class Assignment1 {

  public int solve(int A, int B) {
    return (A & (1 << B)) != 0 ? 1 : 0;
  }

}
