/*  JFM1T2_Assignment6:

    Write a program that swaps the values of 2 variables without using third variable.
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: 
    12
    Enter second number: 
    45
    
    Expected Output:
    Before swapping: 12 , 45
    After swapping: 45 , 12
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Swapping {

public static void method(String args[])//main method
  {
    Scanner sc=new Scanner(System.in);
 System.out.println("enter First number");
    int a =sc.nextInt();
    System.out.println("enter second number");
    int b =sc.nextInt();
    int temp =a;
    a=b;
    b=temp;
    System.out.println("a="+a+"b="+b);}

/*
  Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/

/*
  Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/

//swapping two numbers without using third variable

//print result

}

//Good Job!
//Please push your assignment to github. If you have pused it, forget this comment.

//Please maintain proper comments in your code.
