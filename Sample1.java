//  Complete and execute java program to create Student objects.

//Creating a class which contains the main method 
class Sample1 {

	public static void main(String args[]) {

	//Write code here to create two Student objects,assign value to their id and name and print the 			//details for both the objects
    Student obj1=new Student();
    obj1.id=1;
    obj1.name="john";
    Student obj2=new Student();
    obj2.id=2;
    obj2.name="smith";
    System.out.println("1st student details of roll no "+obj1.id+" with name "+obj1.name);
    System.out.println("2st student details of roll no "+obj2.id+" with name "+obj2.name);

	}
}
	
//Creating Student class
class Student {  
int id;  
String name;  
}  

		    
