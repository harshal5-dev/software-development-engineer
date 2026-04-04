package L7_Arrays_Subarrays;

import util.Utils;

public class Main {

  static void main() {
    System.out.println();
    System.out.println("Hello and welcome!");

    Assignment4 assignment4 = new Assignment4();
    Assignment5 assignment5 = new Assignment5();
    Assignment6 assignment6 = new Assignment6();
    Assignment7 assignment7 = new Assignment7();

    int[] A = {4, 3, 2, 6};
    int[] B = {4, 2, 2};
    int[] C = {2, 1, 3, 4, 5};
    int[] D = {2, 2, 2};
    int[] E = {1, 2, 3};
    int[] F = {2 ,1 ,3};
    int[] G = {5, 2, 1, 4};

    System.out.println("----------- Assignment4 -----------");
    Utils.printArray(assignment4.solve(A, 1, 3));
    Utils.printArray(assignment4.solve(B, 0, 1));
    System.out.println("TC - O(N), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment5 -----------");
    System.out.println(assignment5.maxSubArray(5, 12, C));
    System.out.println(assignment5.maxSubArray(3, 1, D));
    System.out.println("TC - O(N), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment6 -----------");
    System.out.println(assignment6.subArraySum(E));
    System.out.println(assignment6.subArraySum(F));
    System.out.println("TC - O(N), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment7 -----------");
    Utils.printArray(assignment7.solve(E));
    Utils.printArray(assignment7.solve(G));
    System.out.println("TC - O(N), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
  }
}
