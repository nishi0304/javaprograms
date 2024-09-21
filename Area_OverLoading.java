package learning.oops;

public class Area_OverLoading {
	void area(int side)
	{
		System.out.println("Area of square  "+(side*side));
	}
	void area(int width,int height)
	{
		System.out.println("Area of Rectangle "+(width*height));
	}
	void area(int base,float height)
	{
		System.out.println("Area of triangle  "+(.5f*base*height));
	}
	void area(float radius) {
		System.out.println("Area of circle  "+(3.14f*radius*radius));
	}
	public static void main(String[] args) {
		Area_OverLoading obj =new Area_OverLoading();
		obj.area(12);
		obj.area(3.2f);
		obj.area(2, 4.0f);
		obj.area(3, 4);
		
	}

}
