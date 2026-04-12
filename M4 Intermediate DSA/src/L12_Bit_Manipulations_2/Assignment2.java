package L12_Bit_Manipulations_2;

public class Assignment2 {

  public int numSetBits(int A) {
    int ans = 0;

    while (A > 0) {
      if ((A & 1) == 1) {
        ans++;
      }

      A = A >> 1;
    }

    return ans;
  }

}
