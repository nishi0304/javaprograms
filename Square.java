package learning.oops;

public class Square {
	int side;
	Square ()//defualt constructor 
	{
		side=5;
		System.out.println("Inside constructor");
	}
	void area() {
		System.out.println("Area of Square  "+(side*side));
	}
	void display() {
		System.out.println("side of square  "+side);
	}
	public static void main(String[] args) {
		Square obj =new Square();//constructor calling at the time of object creation 
		obj.area();
		obj.display();
	}

}
