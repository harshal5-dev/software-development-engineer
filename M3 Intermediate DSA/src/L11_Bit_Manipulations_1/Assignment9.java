package L11_Bit_Manipulations_1;

public class Assignment9 {

  public int singleNumber(final int[] A) {
    int ans = 0;

    for (int ele: A) {
      ans ^= ele;
    }

    return ans;
  }

}
