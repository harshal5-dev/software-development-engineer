package L6_Arrays_Carry_Forward;

public class Assignment4 {

  public long solve(String A){
    int count  = 0;
    long ans = 0;
    int N = A.length();

    for (int index = N -1; index >= 0; index--) {

      if (A.charAt(index) == 'G') {
        count++;
      }

      if (A.charAt(index) == 'A') {
        ans += count;
      }
    }

    return ans;
  }

}
