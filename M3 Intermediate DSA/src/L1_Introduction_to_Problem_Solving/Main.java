import L1_Introduction_to_Problem_Solving.Assignment1;
import L1_Introduction_to_Problem_Solving.Assignment2;
import L1_Introduction_to_Problem_Solving.Assignment3;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
  //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
  // to see how IntelliJ IDEA suggests fixing it.
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
