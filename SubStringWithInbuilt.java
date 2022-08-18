/*  JFM1T8_Assignment2:

    Write a program to find a substring in a string using an inbuilt method of String class.
    Prompt the user input from the terminal.
  
    Sample input: Learning made easy at bitLabs
    Enter search string : bitLabs
  
    Expected output: bitLabs is found
  
    Enter search string: bitlab
    Expected output: bitlab is not found
*/

import java.util.Scanner;

public class SubStringWithInbuilt {

public static void main(String args[])//main method
  {
    Scanner sc = new Scanner(System.in);//declare variables
    System.out.println("enter a String");
    String s=sc.nextLine();
    //take input from user
    System.out.println("enter a word to search");
    String s1=sc.nextLine();
    if(s.contains(s1))
    {
      System.out.println("word is found");
    }
    else
    {
     System.out.println("word is  not found"); 
    }

//check if the string contains substring or not if contains print found else print not found
  }
}