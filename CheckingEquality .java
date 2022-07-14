/*  JFM1T2_AssignmentPrograms2:

    Write a program to perform the below actions and print the result. Check if the below numbers are equal or not.
    1. 30 and 20
    2. 20 and 20
    3. 20 and 30
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: 
    30
    Enter second number: 
    20
    
    Expected Output:
    30 and 20 is not equal
     
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

 class CheckingEquality {

public static void main(String[] args)//main method
  {
Scanner sc=new Scanner(System.in);
  System.out.println("enter first number :");
    int x =sc.nextInt();
    System.out.println("enter second number :");
    int y =sc.nextInt();
    System.out.println(x == y);
    System.out.println(y == y);
    System.out.println(y == x);
  }/*Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/

/*Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/

//check if the two numbers are equal or not

//If the two numbers are equal then print both are equal else print both are not equal

}

//Good Job!
//Please push your assignment to github. If you have pused it, forget this comment.

//Please maintain proper comments in your code.