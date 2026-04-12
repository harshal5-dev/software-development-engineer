package L12_Bit_Manipulations_2;

public class Main {

  static void main() {
    System.out.println();
    System.out.println("Hello and welcome!");

    Assignment1 assignment1 = new Assignment1();
    Assignment2 assignment2 = new Assignment2();
    Assignment3 assignment3 = new Assignment3();
    Assignment4 assignment4 = new Assignment4();


    System.out.println("----------- Assignment1 -----------");
    System.out.println(assignment1.solve(4, 1));
    System.out.println(assignment1.solve(5, 2));
    System.out.println("TC - O(1), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment2 -----------");
    System.out.println(assignment2.numSetBits(11));
    System.out.println(assignment2.numSetBits(6));
    System.out.println("TC - O(logN), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment3 -----------");
    System.out.println(assignment3.solve(3, 5));
    System.out.println(assignment3.solve(4, 4));
    System.out.println("TC - O(1), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment4 -----------");
    System.out.println(assignment4.solve(4, 1));
    System.out.println(assignment4.solve(5, 2));
    System.out.println("TC - O(1), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
  }

}
