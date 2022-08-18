/*  JFM1T8_Assignment5:

    Write a program to reverse a string using StringBuffer. Reverse entire sentence in string and also reverse each word in the string. 
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    
    Expected output:
    reversing entire string: sbaLtib ta ysae edam gninraeL
    reversing each word at its place: gninraeL edam ysae ta sbaLtib  
*/

import java.util.Scanner;

public class ReverseString {

public static void main(String args[])//main method
  {
  
    Scanner sc= new  Scanner(System.in);
    //declare variables and take input from user
    System.out.println("Enter a String");
     StringBuffer a= new StringBuffer(sc.nextLine());
    
    
    System.out.println("reverse of given sentence= "+(a.reverse()));
          String str = a.toString();
    String[] strArray = str.split(" ");  

  
    // String rev=" ";
            // int [] arr = new int [a.length()];  
        for (int i = strArray.length-1; i >= 0; i--) {  
            // System.out.print(resultarray[i] + " ");
          // rev+=strArray[i];
          System.out.print(strArray[i]+" ");
          
        }  
    
  // System.out.println(rev);


//creat stringbuffer object for string reversing

//reverse input string

//print entire string result

//call reverWordInMyString method

/* 
   Use split() method of String class splits
   a string in several strings based on the
   delimiter passed as an argument to it
*/


/* 
   Use charAt() function returns the character
   at the given position in a string
*/

//print reverse each word string result
  }
}