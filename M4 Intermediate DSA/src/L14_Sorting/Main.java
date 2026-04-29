package L14_Sorting;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  static void main() {
    System.out.println();
    System.out.println("Hello and welcome!");

    Assignment1 assignment1 = new Assignment1();
    Assignment2 assignment2 = new Assignment2();
    Assignment3 assignment3 = new Assignment3();
    Assignment4 assignment4 = new Assignment4();

    int[] A = {2 , 1};
    int[] B = {5};
    int[] C = { 3, 2, 1, 3};
    int[] D = { 1, 1, 3, 3};
    ArrayList<Integer> E = new ArrayList<>(List.of(6, 8, 9 ));
    ArrayList<Integer> F = new ArrayList<>(List.of(2, 4, 7));
    ArrayList<Integer> G = new ArrayList<>(List.of(3, 30, 34, 5, 9));
    ArrayList<Integer> H = new ArrayList<>(List.of(2, 3, 9, 0));

    System.out.println("----------- Assignment1 -----------");
    System.out.println(assignment1.solve(A));
    System.out.println(assignment1.solve(B));
    System.out.println("TC - O(N LogN), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment2 -----------");
    System.out.println(assignment2.solve(C));
    System.out.println(assignment2.solve(D));
    System.out.println("TC - O(N logN), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment3 -----------");
    System.out.println(assignment3.solve(E));
    System.out.println(assignment3.solve(F));
    System.out.println("TC - O(N logN), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment4 -----------");
    System.out.println(assignment4.largestNumber(G));
    System.out.println(assignment4.largestNumber(H));
    System.out.println("TC - O(N logN), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
  }

}
