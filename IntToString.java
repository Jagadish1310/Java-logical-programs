/*  JFM1T8_Assignment1:

    Write a program to convert an int variable to String using an inbuilt function of String class and print the char at index position 2.
    Prompt the user input from the terminal.
    
    Sample input: 54321
    
    Expected output: char at index position 2 = 3
*/

import java.util.Scanner;

public class IntToString {

public static void main(String args[])//main method
  {
    int s;//declare int type variable

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter integer ");
    s=sc.nextInt();//take input from user

    String a=Integer.toString(s);//converting integer to string using toString method

    char ch=a.charAt(2);
    //use inbuilt function to print index position

   System.out.println(ch);//print result
}
}