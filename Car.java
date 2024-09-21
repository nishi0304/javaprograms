package learning.oops;

public class Car {
	String model,color;
	double price;
	Car()
	{
		model="punch";
		
		color="black";
		price=700000;
		
	}
	void getInfo() {
		System.out.println("Model of the car "+model);
		System.out.println("Color of the model "+color);
		System.out.println("Price of the model "+price);
	}
	public static void main(String[] args) {
		Car obj=new Car();
		obj.getInfo();
	}

}
