// Complete and execute java Program for Narrow/Explicit Type-casting

class Sample1 {
	public static void main(String args[])
	{
		int cs=50;// Initialize a variable to store your marks of Computer Science subject- out of 50
		
		float p=75;// Calculate the percentage of marks and store it in a float variable
		
		float percentage = cs/p*100;// Cast the percentage to int(whole number, decimal points removed)
		
		// Print the casted percentage
		System.out.println("Percentage of marks in CS = "+percentage );
    int newpercentage = (int) percentage;
    System.out.println("Percentage of marks in CS = "+newpercentage );
	}

}
