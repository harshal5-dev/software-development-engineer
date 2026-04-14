package L13_Maths_Modular_Arthimetic_Introduction;


public class Main {

  static void main() {
    System.out.println();
    System.out.println("Hello and welcome!");

    Assignment1 assignment1 = new Assignment1();
    Assignment2 assignment2 = new Assignment2();
    Assignment3 assignment3 = new Assignment3();

    int[] A = {1, 4, 3};
    int[] B = {4, 3, 5, 3, 5, 3, 2, 1};
    int[] C = {1, 2, 3};
    int[] D = {1, 0, 0, 1, 2};

    System.out.println("----------- Assignment1 -----------");
    System.out.println(assignment1.solve(2, 3, 3));
    System.out.println(assignment1.solve(5, 2, 4));
    System.out.println("TC - O(N), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment2 -----------");
    System.out.println(assignment2.solve(A, 2));
    System.out.println(assignment2.solve(B, 47));
    System.out.println("TC - O(N), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment3 -----------");
    System.out.println(assignment3.solve(C));
    System.out.println(assignment3.solve(D));
    System.out.println("TC - O(N), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
  }

}
