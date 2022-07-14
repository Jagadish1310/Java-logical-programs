/*  JFM1T2_Assignment5:

    Write a program to print the sum of two numbers without using + operator.
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: 
    22
    Enter second number: 
    50
    
    Expected Output:
    The sum of two numbers is: 72
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class SumWithoutPlus {

public static void method(String args[])//main method
  {
    Scanner sc=new Scanner(System.in);
 System.out.println("enter First number");
    int a =sc.nextInt();
    System.out.println("enter second number");
    int b =sc.nextInt();
    System.out.println("a-(-b):"+(a-(-b)));
  }
/*
  Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/

/*
  Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/

//check if the second number is greater than zero then increase first number and decrease second number

//check if the second number is less than zero then decrease first number and increase second number

//print result

}

//Good Job!
//Please push your assignment to github. If you have pused it, forget this comment.

//Please maintain proper comments in your code.