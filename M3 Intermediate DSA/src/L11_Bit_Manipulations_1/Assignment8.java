package L11_Bit_Manipulations_1;

public class Assignment8 {

  public int DecimalToAnyBase(int A, int B) {
    int ans = 0;
    int pow = 1;

    while (A > 0) {
      int digit = A % B;
      ans += digit * pow;
      A /= B;
      pow *= 10;
    }

    return ans;
  }

}
