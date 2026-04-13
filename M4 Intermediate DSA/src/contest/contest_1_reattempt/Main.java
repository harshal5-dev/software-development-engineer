package contest.contest_1_reattempt;


import util.Utils;

public class Main {

  static void main() {
    System.out.println();
    System.out.println("Hello and welcome!");

    Assignment1 assignment1 = new Assignment1();
    Assignment2 assignment2 = new Assignment2();

    int[] A =  {4, 3, 1, 2};
    int[] B = {6, 9, 10, 8};
    int[] C = {1, 101, 201, 3};
    int[] D = {100, 11, 21, 1};
    int[][] E = {{1, 2}, {1, 4}};
    int[][] F = {{2, 4}, {1, 3}};

    System.out.println("----------- Assignment1 -----------");
    System.out.println(assignment1.solve(A));
    System.out.println(assignment1.solve(B));
    System.out.println("TC - O(N), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment1 -----------");
    Utils.printArray(assignment2.solve(C, E));
    Utils.printArray(assignment2.solve(D, F));
    System.out.println("TC - O(N + Q), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
  }
}
