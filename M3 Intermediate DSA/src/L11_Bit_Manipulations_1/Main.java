package L11_Bit_Manipulations_1;


import util.Utils;

public class Main {

  static void main() {
    System.out.println();
    System.out.println("Hello and welcome!");

    Assignment7 assignment7 = new Assignment7();
    Assignment8 assignment8 = new Assignment8();
    Assignment9  assignment9 = new Assignment9();

    int[] A = {1, 2, 2, 3, 1};
    int[] B = {1, 2, 2};

    System.out.println("----------- Assignment7 -----------");
    System.out.println(assignment7.solve(1010, 2));
    System.out.println(assignment7.solve(22, 3));
    System.out.println("TC - O(log(N)), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment8 -----------");
    System.out.println(assignment8.DecimalToAnyBase(4, 3));
    System.out.println(assignment8.DecimalToAnyBase(4, 2));
    System.out.println("TC - O(log(N)), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment9 -----------");
    System.out.println(assignment9.singleNumber(A));
    System.out.println(assignment9.singleNumber(B));
    System.out.println("TC - O(N), SC - O(1)");
    System.out.println("-----------------------------------");
    System.out.println();
  }

}
