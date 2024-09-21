package learning.oops;

public class OverLoading {
	void add (int x ,int y)
	{
		System.out.println("Sum of two numbers "+(x+y));
	}
	void add(int a,float b)
	{
		System.out.println("Sum of one int and one float numbers "+(a+b));
	}
	void add(float x, float y ,float z)
	{
		System.out.println("Sum of three numbers "+(x+y+z));
	}
	public static void main(String[] args) {
		OverLoading obj=new OverLoading();
		obj.add(12, 4);
		obj.add(12, 12.2f);
		obj.add(12.2f, 12.2f, 21.1f);
		obj.add(5, 3);
		//type promotion= if exact matching is not found and heigher data type method are present then 
		//it will call that method and smaller datatype value is converted into bigger datatype 
		
	}

}
