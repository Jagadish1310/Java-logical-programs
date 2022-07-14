 // Complete and execute java Program for making a simple calculator using switch case
class Sample2 {

	public static void main(String args[]) {

    		//Intialize the char variable below with operators (+, -, *, /) one by one and check the output
    		char operator = '+';
    		
		int first=10,second=5,result=0;
  
    		switch (operator) {
      		case '+':
        	System.out.println("addition is="+(first+second));//Write code to perform addition of first and second
            break;

      		case '-':
        	System.out.println("subtraction is="+(first-second));//Write code to perform subtraction 
            break;

      		case '*':
        	System.out.println("multiplication is="+(first*second));//Write code to perform multiplication
            break;

      		case '/':
        	System.out.println("division="+(first/second));//Write code to perform division
            break;

      		//If operator doesn't match any case constant (+, -, *, /)
      		default:
        	System.out.println("error");// Print Error stating operator is not correct
       break;
    		}

    		System.out.println(first + " " + operator + " " + second + " = " + result);
  	}
}
