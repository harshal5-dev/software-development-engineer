package L6_Arrays_Carry_Forward;

import util.Utils;

public class Main {


  static void main() {
    System.out.println();
    System.out.println("Hello and welcome!");

    Assignment2 assignment2 = new Assignment2();
    Assignment3 assignment3 = new Assignment3();
    Assignment4 assignment4 = new Assignment4();

    int[] A = {16, 17, 4, 3, 5, 2};
    int[] B = {5, 4};
    int[] C = {1, 3, 2};
    int[] D = {2, 6, 1, 6, 9};
    String E = "ABCGAG";
    String F = "GAB";


    System.out.println("----------- Assignment2 -----------");
    Utils.printArray(assignment2.solve(A));
    Utils.printArray(assignment2.solve(B));
    System.out.println("TC - O(N), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment3 -----------");
    System.out.println(assignment3.solve(C));
    System.out.println(assignment3.solve(D));
    System.out.println("TC - O(N), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment4 -----------");
    System.out.println(assignment4.solve(E));
    System.out.println(assignment4.solve(F));
    System.out.println("TC - O(N), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
  }

}
