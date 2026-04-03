package L5_Arrays_Prefix_Sum;

import util.Utils;

public class Main {

  static void main() {
    System.out.println();
    System.out.println("Hello and welcome!");

    int[] A = {1, 2, 3, 4, 5};
    int[][]B = {{0,3}, {1,2}};
    int[] C = {2,2,2};
    int[][] D = {{0,0}, {1,2}};
    int[] E = {1,2,3, 4, 5};
    int[] F = {4,3,2};
    int[] G = {-7, 1, 5, 2, -4, 3, 0};
    int[] H = {1, 2, 3};
    int[][] J = {{0, 2}, {2, 4}, {1, 4}};
    int[] L = {2, 1, 8, 3, 9, 6};
    int[][] M = {{0, 3}, {3, 5}, {1, 3}, {2, 4}};

    Assignment3 assignment3 = new Assignment3();
    Assignment4 assignment4 = new Assignment4();
    Assignment5 assignment5 = new Assignment5();
    Assignment6 assignment6 = new Assignment6();


    System.out.println("----------- Assignment3 -----------");
    Utils.printArray(assignment3.rangeSum(A, B));
    Utils.printArray(assignment3.rangeSum(C, D));
    System.out.println("TC - O(N + Q), SC - O(N)");
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment4 -----------");
    Utils.printArray(assignment4.solve(E));
    Utils.printArray(assignment4.solve(F));
    System.out.println("TC - O(N), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment5 -----------");
    System.out.println(assignment5.solve(G));
    System.out.println(assignment5.solve(H));
    System.out.println("TC - O(N), SC - O(N)");
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment6 -----------");
    Utils.printArray(assignment6.solve(E, J));
    Utils.printArray(assignment6.solve(L, M));
    System.out.println("TC - O(N), SC - O(N)");
    System.out.println("-----------------------------------");

  }
}

