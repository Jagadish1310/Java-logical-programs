/* JFM1T6_Assignment2:
   Write a method that takes 2 numbers as arguments/parameters and returns the value of num2 to the power of num1 back to the main method.
   Prompt the user for the base and power values to be input from the terminal.

   Sample input:
   num1 = 3
   num2 = 2
    
   Expected Output:
   result = 9
   
*/
import java.util.*;
class num
  {
    int r=1;
    int pow(int n,int p)
    {
      while(p>0){
        
        r=r*n;
        p--;
      }
      return r;
    }
  }

public class Power {

public static void main(String args[])
  //main method
  {
//declare variables n,p,r and initialize r as one.
int n,p,r;
//create scanner class object
Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    n=sc.nextInt();
//take input from user
System.out.println("enter a number");
    p=sc.nextInt();
//check if (n>=0&&p==0) if true then it prints 1 else if check (n==0&&p>=1) if true then print zero else multiply r*n
if(n>=0&&p==0)
{
  System.out.println("1");
  
}
    else if(n==0&&p>=1)
    {
       System.out.println("0");
    }
    else
    {
      num obj=new num();
      System.out.println(obj.pow(n,p));
    }
//print result
  }
}