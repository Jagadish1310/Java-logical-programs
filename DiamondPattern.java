/* JFM1T4_Assignment5:
   Write a program to print the following pattern:
       a
     a b a
   a b c b a
     a b a
       a
*/

public class DiamondPattern {

  public static void main(String args[]){
  //Add main method here
 int n=4;
  for(int i=0;i<=n;i++)
{
  for(int j=0;j<=n;j++)
  {
    if((i==2)|| (j==2)||(i+j)%2==0 && j%2!=0)
    {
      if((i==2) && (j==2))
      {
        System.out.print("c"+" ");
    }
    else if(i+j==3 || i+j==5)
    {
      System.out.print("b"+" ");
    }
    else
    {
      System.out.print("a"+" ");
    }
  }
  else
    {
  System.out.print(" "+" ");
    }
}
  System.out.println(" ");
  }
   
    }
 
}

  
//Declare variables i,j,k,m and initialize ch=97(because we are printing alphabet a)

//use for loop and if condition to print a,b,c 
  

/*public class DiamondPattern {

  public static void main(String args[]){
int i, j, row = 6;       
//Outer loop work for rows  
for (i=0; i<row; i++)   
{  
//inner loop work for space      
for (j=row-i; j>1; j--)   
{  
//prints space between two stars  
System.out.print(" ");   
}   
//inner loop for columns  
for (j=0; j<=i; j++ )   
{   
//prints star      
System.out.print("* ");   
}   
//throws the cursor in a new line after printing each line  
System.out.println();   
}   
}   
}  */