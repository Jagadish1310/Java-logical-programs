//JFM1T3_Assignment1: 
/* Write a program to calculate the circumference of a circle and print the result in whole number. 
  Allow user to input the cirlce radius from terminal. 

  Sample Input:
    radius of the circle=6

  Expected Output:
   Circumference of the circle=38
   

*/ 

//import statement for java program to read inputs using Scanner class 
import java.util.Scanner;

public class Circle { 

public static void main(String[] args)//Define main method
  {
    Scanner sc=new Scanner(System.in);
    int radius;
    double circumference;
    double pie = 3.32;
    System.out.println("enter radius value");
    radius=sc.nextInt();
    circumference= 2*pie*radius;
    System.out.println("circumference of circle is"+(circumference));
  }
//Declare the variables
/*int radius;
Scanner sc=new Scanner(System.in);
  radius = sc.nextInt();
  

//Use the scanner class to provide radius at execution time

/*
Scanner scanner = new Scanner(System.in);
System.out.println("Enter radius as a positive integer");
radius= scanner.nextInt();
*/

//Caluculate the circumference of the circle

//Casting the floating-point value to int  

//Print the Result

} 