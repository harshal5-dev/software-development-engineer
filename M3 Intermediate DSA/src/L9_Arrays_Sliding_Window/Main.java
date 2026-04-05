package L9_Arrays_Sliding_Window;

import util.Utils;

public class Main {

  static void main() {

    System.out.println();
    System.out.println("Hello and welcome!");

    Assignment1 assignment1 = new Assignment1();
    Assignment2 assignment2 = new Assignment2();
    Assignment3 assignment3 = new Assignment3();


    int[] A = {4, 3, 2, 6, 1};
    int[] B = {4, 2, 2, 5, 1};
    int[] C = {1, 12, 10, 3, 14, 10, 5};
    int[] D = {5, 17, 100, 11};

    System.out.println("----------- Assignment1 -----------");
    System.out.println(assignment1.solve(A, 3, 11));
    System.out.println(assignment1.solve(B, 4, 6));
    System.out.println("TC - O(N), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment2 -----------");
    System.out.println(assignment2.solve(C, 8));
    System.out.println(assignment2.solve(D, 20));
    System.out.println("TC - O(N), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment3 -----------");
    Utils.printArray(assignment3.generateMatrix(1));
    System.out.println();
    Utils.printArray(assignment3.generateMatrix(2));
    System.out.println();
    Utils.printArray(assignment3.generateMatrix(5));
    System.out.println("TC - O(N * N), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();

  }

}
