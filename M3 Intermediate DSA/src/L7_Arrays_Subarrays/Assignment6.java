package L7_Arrays_Subarrays;

public class Assignment6 {

  public long subArraySum(int[] A) {
    int N = A.length;
    long ans = 0;

    for (int index = 0; index < N; index++) {
      long contributionCount = (long) (index + 1) * (N - index);
      ans += A[index] * contributionCount;
    }

    return ans;
  }

}
