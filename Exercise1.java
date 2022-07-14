// Write a program to print the sum of first 10 natural numbers

/*class Exercise1 {

	public static void main(String args[]) {
 int n =10,sum =0;
 int i=1;
    while(i<=n)
      {
        sum=sum+i;
        i++;
      }
System.out.println("first 10 natural numbers is " +sum);
	}

}*/
import java.util.*;
class Exercise1 {

	public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n;
    int sum = 0;
    System.out.println("enter n value");
    n=sc.nextInt();
    int i = 1;
    while(i<=n)
    {
      sum=sum+i;
      i++;
    }
    System.out.println("sum of " +n+ "natural numbers" +sum);
  }
    
  }