package L1_Introduction_to_Problem_Solving;

public class Main {

  static void main() {
    IO.println("Hello and welcome!");
    Assignment1 assignment1 = new Assignment1();
    Assignment2 assignment2 = new Assignment2();
    Assignment3 assignment3 = new Assignment3();

    int A= 5;
    int B = 10;
    int C = 4;
    int D = 1001;

    System.out.println("----------- Assignment1 -----------");
    System.out.println(assignment1.solve(A));
    System.out.println(assignment1.solve(B));
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment2 -----------");
    System.out.println(assignment2.solve(A));
    System.out.println(assignment2.solve(B));
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("----------- Assignment3 -----------");
    System.out.println(assignment3.solve(C));
    System.out.println(assignment3.solve(D));
    System.out.println("-----------------------------------");
    System.out.println();
  }

}
