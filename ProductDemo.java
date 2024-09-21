package learning.oops;

public class ProductDemo {
	public static void main(String[] args) {
		Product p=new Product();
		p.setProduct("laptop", "HP", 80000);
		p.discoun();
		p.getProduct();
		System.out.println("-------------------");
		Product p1=new Product();
		p1.setProduct("Pen", "Parker", 600);
		p1.discoun();
		p1.getProduct();
		System.out.println("------------------");
		Product p2=new Product();
		p2.setProduct("Shirt", "H&M- ", 2000);
		p2.discoun();
		p2.getProduct();
	}
	

}
