package learning.oops;

public class Circle {
	float radius;
	void setRadius(float r)
	{
		radius=r;
	}
	void area()
	{
		float a=3.14f*radius;
		System.out.println("The Area of Circle is"+a);
		
	}
	void circumference()
	{
		float c=2*(3.14f)*radius;
		System.out.println("The Circumference of Circle"+c);
	} 
	void getRadius()
	{
		System.out.println("The raius of circle is "+radius);
	}
////	public static void main(String[] args) {
//		Circle ci=new Circle();
//		ci.setRadius(15);
//		ci.getRadius();
//		ci.circumference();
//		ci.area();
//	}
}
