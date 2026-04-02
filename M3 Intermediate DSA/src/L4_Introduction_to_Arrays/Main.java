package L4_Introduction_to_Arrays;

import util.Utils;

public class Main {

  static void main() {
    System.out.println();
    System.out.println("Hello and welcome!");
    Assignment1 assignment1 = new Assignment1();
    Assignment2 assignment2 = new Assignment2();
    Assignment3 assignment3 = new Assignment3();
    Assignment4 assignment4 = new Assignment4();
    Assignment5 assignment5 = new Assignment5();

    int[] A= {3, 1, 2};
    int[] B = {5, 5, 3};
    int[] C = {1, 2, 3, 4};
    int[] D = {1, 2, 4};
    int[] E = {2, 5, 6};
    int[] F = {1, 2,3, 2, 1};
    int[] G = {1, 1, 10};
    int[] H = {1, 2, 3, 4};
    int[] I = {2, 5, 6};

    System.out.println("----------- Assignment1 -----------");
    System.out.println(assignment1.solve(A));
    System.out.println(assignment1.solve(B));
    System.out.println("TC - O(N), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("------------- Assignment2 ----------");
    System.out.println(assignment2.solve(C, 7));
    System.out.println(assignment2.solve(D, 4));
    System.out.println("TC - O(N ^ 2), SC - O(1)");
    System.out.println("------------------------------------");
    System.out.println();
    System.out.println("------------- Assignment3 ----------");
    Utils.printArray(assignment3.solve(C, 2, 3));
    Utils.printArray(assignment3.solve(E, 0, 2));
    System.out.println("TC - O(N), SC - O(1)");
    System.out.println("-------------------------------------");
    System.out.println();
    System.out.println("------------- Assignment4 ----------");
    Utils.printArray(assignment4.solve(F));
    Utils.printArray(assignment4.solve(G));
    System.out.println("TC - O(N), SC - O(N)");
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("------------- Assignment5 ----------");
    Utils.printArray(assignment5.solve(H, 2));
    Utils.printArray(assignment5.solve(I, 1));
    System.out.println("TC - O(N), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
  }

}
