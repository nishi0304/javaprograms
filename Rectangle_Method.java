package learning.oops;

public class Rectangle_Method {
	float width,height;//instance variable or global variable
	String color;
	
	void setDimension(float w,float h,String c)//parameters
	{
		//body of function
		width=w;//assinging value in the instance variable
		height=h;
		color=c;
		
	}
	void area()//instance method
	{
		float a=width*height;
		System.out.println("Area of Rectangle is "+a);
	}
	void parimeter() {
		float p=2*(width+height);
		System.out.println("Perimeter is"+p);
	}
	void getDimension()
	{ 
		System.out.println("Height of the Rectangle"+height);
		System.out.println("Width of the Rectangle"+width);
		System.out.println("Color of the Rectangle"+color);
	}
	
	public static void main(String[] args)
	{
		Rectangle_Method r=new Rectangle_Method();	
		r.setDimension(2.3f, 2.0f, "Red");//calling instance method of Rectangle clas
		r.area();
		r.parimeter();
		r.getDimension();
		
	}
	

}
