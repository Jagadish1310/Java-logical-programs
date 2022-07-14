/* JFM1T4_Assignment4:
   Write a program to print the following pattern:
     1 
     01 
     101 
     0101 
     10101 
*/
/*import java.util.*;
public class Pattern {
  public static void main(String args[])
  {
    int i,j,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter rows");
    n=sc.nextInt();
    for(i=1;i<=n;i++)
      {
        for(j=5;j>=i;j--)
        {
          if(j%2==0)
            System.out.print(0);
          else
            System.out.print("*");
        }
          System.out.println();
  }
  }
     
//Add main method here

//Declare variable n and initialize value as 5

//Check whether the i and j are equal or not using for loop

//If i and j are equal check (i+j)%2==0 or not if zero then print one else print zero


}*/
import java.util.*;
public class Pattern {
  public static void main(String args[])
  {
    int i,j,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter rows");
    n=sc.nextInt();
    for(i=1;i<=n;i++)
      {
        for(j=1;j<=n-i;j++)
        {
          System.out.print(" ");
        }
        for(int k=1;k<=i;k++)
        {
          System.out.print(k);
        }
        
          /*if(j%2==0)
            System.out.print(0);
          else*/
            
          System.out.println();
  }
  }
}