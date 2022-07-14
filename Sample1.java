// Complete and execute java Program for checking the number of digits in a number
class Sample1 {

	public static void main(String args[]) {
		int num =12345;// you can also change the value to test the output
		
		if(num>99) {//Write Test condition1
	  		System.out.println("Its a two digit number");
		}
		else if(num>999&&num<100) {
	  		System.out.println("Its a three digit number");
		}
		else if(num>9999&&num<1000) {
	  		System.out.println("Its a four digit number");
		}
		else if(num>99999&&num<10000) {
	  		System.out.println("Its a five digit number");			
		}
		else {
	  		System.out.println("number is not between 1 & 99999");			
		}
   	}
}
