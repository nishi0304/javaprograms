package learning.oops;

public class Rectangle {
	float width=2.5f,height=3.5f;//instance variable or global variable
	String color="Green";
	//float,double=0.0
	//string -null
	//int,long=0
	//char=space
	//boolean=false
	public static void main(String[] args)
	{
		Rectangle r=new Rectangle();//object of rectangle class syntax of creating object class
		// r is the reference variable of the object 
		//new keyword is used for dynamic memory allocation
		//objects are always created at the run time
		System.out.println(r.width);//always access with instance
		System.out.println("height is "+r.height);
		System.out.println("color is "+r.color);
		//another object of rectangle class 
		Rectangle r1=new Rectangle();
		System.out.println(r1.width);//always access with instance
		System.out.println("height is "+r1.height);
		System.out.println("color is "+r1
			.color);
		
		
	}
	

}
