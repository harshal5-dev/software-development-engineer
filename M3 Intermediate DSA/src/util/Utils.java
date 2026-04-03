package util;

public final class Utils {

  private Utils() {}

  public static void printArray(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  public static void printArray(long[] arr) {
    for (long i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
