/*  JFM1T8_Assignment3:

    Write a program to find a substring in a string without using an inbuilt method of String class.
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    Enter search string: bitLabs
    
    Expected output: bitLabs is found
    
    Enter search string: bitlab
    Expected output: bitlab is not found

*/

import java.util.Scanner;

public class SubStringWithoutInbuilt {

public static void main(String args[])//main method
  {//declare variables
   Scanner sc = new Scanner(System.in);//declare variables
    System.out.println("enter a String");
    String s=sc.nextLine();
    //take input from user
    System.out.println("enter a word to search");
    String s1=sc.nextLine();
    for(int i=0;i<s.length();i++)
      {
        if(s.charAt(i)==s1.charAt(0))
        {
          int k=i+1;
          int count=1;
          for(int j=1;j<s1.length();j++)
            {
              if(s.charAt(k)==s1.charAt(j))
              {
                k++;
                count++;
                
              }
            }
          if(count==s1.length())
            System.out.println("word is found");
          else
            System.out.println("word is not found");
          break;
        }
      }
    //compare two strings if the search string found or not without using inbuilt method isSubString()

//creat isSubString method in that declare variable 

//check two strings if the search string is present then return true else return false
  }
}