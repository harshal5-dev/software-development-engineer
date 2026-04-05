package L8_Arrays_2D_Matrices;


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
    Assignment6 assignment6 = new Assignment6();
    Assignment7 assignment7 = new Assignment7();

    int[][] A = {{1,2,3,4}, {5,6,7,8}, {9,2,3,4}};
    int[][] B = {{1, -2, -3}, {-4, 5, -6}, {-7, -8, 9}};
    int[][] C = {{3, 2}, {2 , 3}};
    int[][] D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] E = {{1, 2}, {3, 4}};
    int[][] F = {{1, 2}, {1, 2}, {1, 2}};


    System.out.println("----------- Assignment1 -----------");
    Utils.printArray(assignment1.solve(A));
    System.out.println("TC - O(N * M), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment2 -----------");
    Utils.printArray(assignment2.solve(A));
    System.out.println("TC - O(N * N), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment3 -----------");
    System.out.println(assignment3.solve(B));
    System.out.println(assignment3.solve(C));
    System.out.println("----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment4 -----------");
    System.out.println(assignment4.solve(B));
    System.out.println(assignment4.solve(C));
    System.out.println("TC - O(N * N), SC - O(1)");
    System.out.println("----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment5 -----------");
    Utils.printArray(assignment5.diagonal(D));
    Utils.printArray(assignment5.diagonal(E));
    System.out.println("TC - O(N * N), SC - O(1)");
    System.out.println("----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment6 -----------");
    Utils.printArray(assignment6.solve(D));
    Utils.printArray(assignment6.solve(F));
    System.out.println("TC - O(N * M), SC - O(1)");
    System.out.println("----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment7 -----------");
    assignment7.solve(E);
    assignment7.solve(D);
    Utils.printArray(E);
    Utils.printArray(D);
    System.out.println("TC - O(N * N), SC - O(1)");
    System.out.println("----------------------------------");
    System.out.println();
  }
}
