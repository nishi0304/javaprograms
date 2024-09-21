package learning.oops;

public class ParameterisedConstructor 
{
public static void main(String[] args) 
{
	Student s=new Student();//calling default const
	Student s1=new Student("Scott",50,50,50 );//calling paramterised constructor
	s.display();
	s1.display();
	s1.avgrageMarks();
	s.avgrageMarks();
}
}
class Student
{
	String name;
	float hi,maths,eng;
	Student()//default constructor
	{
		name="guest";
		hi=1.0f;
		maths=1.0f;
		eng=1.0f;
		System.out.println("In default constructor");
	}
	
	Student (String name,float hi,float maths,float eng)
	{
		System.out.println("In Parameterised constructor");
		this.name=name;
		this.hi=hi;
		this.maths=maths;
		this.eng=eng;
	}
	void display() {
		System.out.println("Name of the student "+name);
		System.out.println("Marks in hindi "+hi);
		System.out.println("Marks in maths "+maths);
		System.out.println("Marks in english "+eng);
	}
	void avgrageMarks() {
		float avg=(hi+eng+maths)/3;
		System.out.println("Avarage marks of " +name+ " is " +avg);
	}
	
	
	
}
