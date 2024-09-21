package learning.oops;
import java.util.*;

public class MovieDemo 
{
public static void main(String[] args) {

	 Movie obj = new Movie();
	 obj.display();

	 //Movie obj1 = new Movie(name,);
	 //obj1.display();

	
	 
}
	}
class Movie {
	String name;
	float rating;
	
	 Movie(String name, float rating)
	 {
		 Scanner sc=new Scanner(System.in);
			System.out.println(" Enter the Name of the movie ");
			 this.name =sc.nextLine();
			 System.out.println(" Enter the rating of the movie ");
			 this. rating =sc.nextFloat();
			 sc.close();
}
	  
	
	Movie()
	  {
		  name="Ved";
		  rating=4.5f;

       //	Scanner sc=new Scanner(System.in);
			//System.out.println(" Enter the Name of the movie ");
			// String  name =sc.nextLine();
			// System.out.println(" Enter the rating of the movie ");
			// float rating =sc.nextFloat();
	  }
	  void display() {
		  System.out.println(" Name of the movie "+name);
	       if(rating >=0.0 &&rating <=2.0) {
	    	   System.out.println(" Ratinng of the movie " +rating+ "Flop");
	       } 
	       else if(rating >=2.1 && rating <= 3.4) {
	    	   System.out.println(" Ratinng of the movie " +rating+ "Semi-Hit");
	       }
	       else if(rating >=3.5  && rating <= 4.5) {
	    	   System.out.println(" Ratinng of the movie " +rating+ "Hit");
	  } 
	       else  
	  {
   	   System.out.println(" Ratinng of the movie " +rating+ " Super Hit");
}
	  }
}

	  
