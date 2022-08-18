/* 
   JFM1T5_Assignment 5:
   Write a program to find and print the maximum element in a two-dimensional array with its index position.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of row and column: 
   2
   3
   Enter arr [ 0 ] [ 0] : 1
   Enter arr [ 0 ] [ 1] : 2
   Enter arr [ 0 ] [ 2] : 3

   Enter arr [ 1 ] [ 0] : 4
   Enter arr [ 1 ] [ 1] : 5
   Enter arr [ 1 ] [ 2] : 6
   
   Expected Output:
   Largest element in array is 6 and its index position is arr [ 1 ] [ 2 ]  

*/

import java.util.Scanner;

public class TwoDimentionalArray {

public static void main(String args[])//Define the main method
  {
    int rows,cols;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no of rows");
    rows=sc.nextInt();
    System.out.println("Enter no of columns");
    cols=sc.nextInt();
    int a[][]=new int[rows][cols],i,j,r=0,c=0;
     System.out.println("Enter elements");
    for(i=0;i<rows;i++)
      {
        for(j=0;j<cols;j++)
          {
            a[i][j]=sc.nextInt();
            
        }
        
    }
    
    int max=0;
    for(i=0;i<rows;i++)
    {
      for(j=0;j<cols;j++)
        {
          if(max<a[i][j])
          {
            max=a[i][j];
           r=i;
            c=j;
          }
        }
      
    }
    System.out.println("Largest element in array is "+max+" and its index position is arr"+r+" "+c);
  }
//Declare the variables

//Take number of rows and columns from user in two-dimensional array

//assume first element is largest and use for loop to compare the largest element with all the reamaining elements

//Calcualte the maximum element based on index poistion

//Print result

}