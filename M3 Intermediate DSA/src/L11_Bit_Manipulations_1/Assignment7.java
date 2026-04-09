package L11_Bit_Manipulations_1;

public class Assignment7 {

  public int solve(int A, int B) {
    int ans = 0;
    int pow = 1;

    while (A > 0) {
      int digit = A % 10;
      ans += digit * pow;
      A /= 10;
      pow *= B;
    }

    return ans;
  }
}
