package learning.oops;
import java.util.*;
public class PConstructorDemo {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter lenth breadth height");
	 int x=sc.nextInt();
	 int y=sc.nextInt();
	 int z=sc.nextInt();
	Cuboid c=new Cuboid(x,y,z);
	c.display();
	sc.close();
}
}
class Cuboid
{
	int l,b,h;
	String color;
	Cuboid()
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter lenth breadth height");
		 int x=sc.nextInt();
		 int y=sc.nextInt();
		 int z=sc.nextInt();
		l=x;
		b=y;
		h=z;
		color="black";
		sc.close();
	}
	Cuboid (int l ,int b,int h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
		
	}
	Cuboid (int l ,int b,int h,String color)
	{
		
	}
	void volume() {
		
	}
	void area() {
		//2*(lb*bh*ha)
	}
	void display() {
		
	}
	
	
	
}

