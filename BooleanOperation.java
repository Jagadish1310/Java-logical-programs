/*  JFM1T2_Assignment3:

     Print the results for the following statements considering x = true and y = false
             1. x&&y
             2. x||y
             3. !x
             4. !y
     Prompt the user input from the terminal.
             
     Sample Input:
     Enter x as boolean value(true/false): 
     true
     Enter y as boolean value(true/false): 
     false
     
     Expected Output:
     x&&y is: false
     x||y is: true
     !x is: false
     !y is: true

*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class BooleanOperation {

public static void main(String[] args)//main method
  {
    Scanner sc=new Scanner(System.in);
     System.out.println("enter x number");
    boolean x =sc.nextBoolean();
    System.out.println("enter y number");
    boolean y =sc.nextBoolean();
    System.out.println("x&&y is:"+(x&&y));
    System.out.println("x||y is:"+(x||y));
    System.out.println("!x is:"+(!x));
    System.out.println("!y is:"+(!y));
  }
/*Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/

/*Take input from user
  System.out.println("Enter x as boolean value(true/false): ");
  boolean x=sc.nextBoolean();
*/

//print apppropriate result for boolean operations

}

//Good Job!
//Please push your assignment to github. If you have pused it, forget this comment.

//Please maintain proper comments in your code.
