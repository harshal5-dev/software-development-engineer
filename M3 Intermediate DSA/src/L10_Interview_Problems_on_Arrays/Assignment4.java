package L10_Interview_Problems_on_Arrays;

public class Assignment4 {

  public int majorityElement(int[] A) {
    int N = A.length;
    int ans = A[0];
    int freq = 1;

    for (int index= 1; index < N; index++) {
      if (freq == 0) {
        ans = A[index];
        freq = 1;
      } else if (A[index] == ans) {
        freq++;
      } else  {
        freq--;
      }
    }

    return ans;
  }

}
