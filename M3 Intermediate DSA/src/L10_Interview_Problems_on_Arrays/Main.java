package L10_Interview_Problems_on_Arrays;


import util.Utils;

public class Main {

  static void main() {
    System.out.println();
    System.out.println("Hello and welcome!");

    Assignment1 assignment1 = new Assignment1();
    Assignment2 assignment2 = new Assignment2();
    Assignment3 assignment3 = new Assignment3();
    Assignment4 assignment4 = new Assignment4();

    int[] A = {1, 2, 3, 4, 5};
    int[][] B = {{0, 2}, {1, 4}};
    int[] C = {2, 1, 8, 3, 9};
    int[][] D = {{0 ,3}, {2, 4}};
    int[] E = {2, 1, 6, 4};
    int[] F = {1, 1, 1};
    int[] G = {2, 1, 2};

    System.out.println("----------- Assignment1 -----------");
    Utils.printArray(assignment1.solve(A, B));
    Utils.printArray(assignment1.solve(C, D));
    System.out.println("TC - O(N + Q), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment2 -----------");
    Utils.printArray(assignment2.solve(A, B));
    Utils.printArray(assignment2.solve(C, D));
    System.out.println("TC - O(N + Q), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment3 -----------");
    System.out.println(assignment3.solve(E));
    System.out.println(assignment3.solve(F));
    System.out.println("TC - O(N), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment4 -----------");
    System.out.println(assignment4.majorityElement(G));
    System.out.println(assignment4.majorityElement(F));
    System.out.println("TC - O(N), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
  }

}
