package learning.oops;

public class CircleDemo {
	float radius;
	public static void main(String[] args) {
		Circle ci=new Circle();
	
		ci.setRadius(15);
		ci.getRadius();
		ci.circumference();
		ci.area();
	}
}
