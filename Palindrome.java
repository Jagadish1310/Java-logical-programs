/*  JFM1T8_Assignment4:

    Write a program to check whether a string is a Palindrome.
    Prompt the user input from the terminal.
    
    Sample input: Malayalam
    
    Expected output: Malayalam is a Palindrome
*/

import java.util.Scanner;

public class Palindrome {

public static void main(String args[])//main method
  {
    String s;//declare varible
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a String");
    s=sc.nextLine();
    int l=s.length(),i;
    String rev="";
    //take input from user
    for(i=l-1;i>=0;i--)
     rev=rev+s.charAt(i);
    if (s.equals(rev))  
         System.out.println("string is a palindrome.");  
      else  
         System.out.println("string isn't a palindrome.");
    

/* 
   divide the whole string into two halves and compare each character in the 
   first half with each character in the second half in reverse.  
   If both are equal then it is a palindrome else print it is not a palindrome 
*/
  }
}