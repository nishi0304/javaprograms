package learning.oops;

import java.util.*;

public class Cube {
	int edge;
	 Cube(){
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the edge  "+edge);
		 edge=sc.nextInt();
		 sc.close();
	 }
	 Cube(int edge){
		 this.edge=edge;	 
	 }
	 void volume () {
		 int v =edge*edge*edge;
		 System.out.println("Volume of the cube "+v);
	 }
	 void surfaceArea () {
		 int sa =6*edge*edge;
		 System.out.println("Volume of the cube "+sa);
	 }
	 public static void main(String[] args) {
		Cube c=new Cube();
		c.volume();
		c.surfaceArea();
		Cube c1=new Cube(1);
		c1.volume();
		c1.surfaceArea();
	}

}
