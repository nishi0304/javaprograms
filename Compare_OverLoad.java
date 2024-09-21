package learning.oops;

public class Compare_OverLoad {
	void compare(int a,int b)
	{
		if(a<b)
		{
			System.out.println(b+"s the greater number");
		}
		else {
			System.out.println(a+" is the greater number");
		}
	}
	void compare(char a,char b)
	{
	
		if(a<b)
		{
			System.out.println(b+" is the greater character");
		}
		else {
			System.out.println(a+" is the greater charater");
		}
	}
	public static void main(String[] args) {
		Compare_OverLoad obj=new Compare_OverLoad();
		obj.compare(5, 2);
		obj.compare('b', 'a');;
		
	}

}
