package learning.oops;

public class BookFairDemo {
	//String bookname,authorName;
	//float price;
	public static void main(String[] args) {
		BookFair obj=new BookFair();
		obj.setBookDetails("java", "abc", 400);
		obj.calculateDiscount();
		obj.display();
	}
}
