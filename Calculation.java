package learning.oops;

public class Calculation {
	void add(int n1,int n2) 
	{
		System.out.println("Addition of two numbers is "+(n1+n2));
	}
	void divide(int a,int b)
	{
		//float result =(float)
		System.out.println("Division of " +a+"  and " +b + " numbers is "+(float)a/b);
	}
	public static void main(String[] args) {
		Calculation obj=new Calculation();
		obj.add(10, 1);
		obj.divide(10, 9);
	}

}
