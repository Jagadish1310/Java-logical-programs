//  Write a program to create a Book class and its objects.
//Create a class which contains the main method 
class Exercise1 {

	public static void main(String args[]) {

	//Write code here to create two Book objects, assign values to attributes and print
    Book obj=new Book();
    obj.price=10;
    obj.pages=100;
    System.out.println(obj.price+" "+obj.pages);
	}
}
	
//Creating Book class
class Book {  
    // Declare Book attributes
  double price;
  int pages;
}  

		    
