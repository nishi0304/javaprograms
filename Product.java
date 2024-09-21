package learning.oops;

public class Product {
	String name,brand;//instance variable
	double price;
	void setProduct(String n,String b,double p) //formal parameters
	{
		name=n;
		brand=b;
		price=p;
		
	}
	void getProduct() 
	{
		System.out.println("Product Name "+name);
		System.out.println("Brand Name "+brand);
		System.out.println("Price "+price);
	}
	void discoun()
       {
		double dis=0.0;
		if(price<1000) {
			dis=price*.05;
			System.out.println("price to pay "+(price-dis));
		        }   
		else if(price>=1000&&price<5000) {
			dis=price*.10;
			System.out.println("price to pay "+(price-dis));
		}
		else
		{
			dis=price*.20;
			System.out.println("price to pay "+(price-dis));
			}
		}
}
