package contest.Contest_1;


import util.Utils;

public class Main {

  static void main() {


    System.out.println();
    System.out.println("Hello and welcome!");

    Assignment1 assignment1 = new Assignment1();
    Assignment3 assignment3 = new Assignment3();


    int[] A = {2, 4, 2};
    int[] B = {3, 2, 1, 5};
    int[] C = {5, 4, 5};
    int[] D = {5, 15, 2, 10};
    int[][] E = {{0, 1}, {1, 2}};
    int[][] F = {{0, 2}, {0, 3}};

    System.out.println("----------- Assignment1 -----------");
    System.out.println(assignment1.solve(A));
    System.out.println(assignment1.solve(B));
    System.out.println("TC - O(N), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment2 -----------");
    Utils.printArray(assignment3.solve(C, E));
    Utils.printArray(assignment3.solve(D, F));
    System.out.println("TC - O(N + Q), SC - O(N)");
    System.out.println("-----------------------------------");
    System.out.println();
  }
}
