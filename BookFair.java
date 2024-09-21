package learning.oops;

public class BookFair {
	String bookname,authorName;
	float price;
	void setBookDetails(String b,String a,float p)
	{	
		bookname=b;
		authorName=a;
		price=p;
	}
		
	void calculateDiscount() {
		if(price<=1000) {
			float d=(2/100)*price;
			float discount=d-price;
			System.out.println("The Price After Discount "+discount);
			
		} else if(price>1000&&price<3000) {
			float d=price *(10/100);
			float discount=d-price;
			
			System.out.println("The Price After Discount "+discount);
		} else{
			float d =price*(15/100);
			float discount=d-price;
			System.out.println("The Price After Discount"+discount);
		}
		
	}
	void display() {
		System.out.println("Name of the book "+bookname);
		System.out.println("Author of the book "+authorName);
		System.out.println("Price og the book "+price);
	
	}
	//public static void main(String[] args) {
	//	BookFair obj=new BookFair();
		//obj.setBookDetails(null, null, 100);
		//obj.calculateDiscount();
		//obj.display();
	}
	


