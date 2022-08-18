/* JFM1T6_Assignment3:

   Write a method that takes any numbers as arguments/parameters and return the mean value back to main method.
   Prompt the user for the  values to be input from the terminal.

   Sample input:
   num1 = 3
   num2 = 2
   num3 = 4

   Expected Output:
   result = 3
   
*/

import java.util.*;
class Test
  {
    int x,y,z;
    void show(int a,int b,int c)
    {
       x=a;
       y=b;
       z=c;
    }
      int mean()
        {
          
        int m=(x+y+z)/3;
          return m;
      }
    
  }

public class Mean {

public static void main(String args[])//main method
  {
//declare variables and initialize sum=0
int sum=0;
//create scanner object
Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of elements");
    int n=sc.nextInt();
    int a[]=new int[n];
    
//take input from user
    for(int i=0;i<n;i++)
      {
        System.out.print("num["+i+"]=");
       a[i]=sc.nextInt();
        }
//check the for loop for number of values entered in input
Test obj=new Test();
    obj.show(a[0],a[1],a[2]);
    int value=obj.mean();
//calculate mean
System.out.println("mean value is "+value);
//print result
      
}
}