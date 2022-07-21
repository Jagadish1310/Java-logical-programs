/*  
    JFM1T5_Assignment 1:
    Write a program to store 10 numbers in an array and display the sum of all the elements.
    Prompt the user for the 10 numbers to be input from the terminal.
    Sample Input:
    Enter the 10  elements:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
    Expected Output:
    Sum of array elements is : 55

*/
import java.util.*;
public class ArraySum {

public static void main(String args[])//Define the main method
  {
    int i,n,sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no of elements");
    n=sc.nextInt();
    System.out.println("enter elements");
    int a[]=new int[n];
    for(i=0;i<n;i++)
      {
        
        a[i]=sc.nextInt();
        sum=sum+a[i];
       
        
      }
     System.out.println(sum);
  /*for(int j=0;j<n;j++)
      {
        sum=sum+a[j];
        System.out.println(sum);
      }*/
    
  }
//Declare the variables and initialize

//Take input from user

//Check user input values using for loop and add all values
 
//Print the result

}
