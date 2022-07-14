/* Write a program to print the following equilateral traingle pattern:
   *
  ***
 *****
*******

*/
class Exercise4 {

	public static void main(String args[]) {
    int i;
      for(i=1;i<=5;i++){
        
          for(int j=1;j<=5-i;j++){
            System.out.print(" ");
        }
            for(int k=1;k<=i*2-1;k++){
            System.out.print("*");
          }
        
      System.out.println();
  }
	}

}