package learning.oops;

public class Employee {
	String name,dept;
	float salary;
	void setEmployee(String name,String dept,float salary)
	{
		//this refers to current object 
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		
	}
	void grossSalary () {
		float hra =salary*.20f;
		float da=salary*.10f;
		float pf=salary*1.0f;
		float gs=salary+hra+da+pf;
	 System.out.println("Gross Salary "+gs);
	}
	void showEmployee()
	{
		System.out.println("Name is "+name);
		System.out.println("dept is "+dept);
		System.out.println("salary is "+salary);
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEmployee("nishi", "IT", 10000);
		e.showEmployee();
		e.grossSalary();
		Employee e1=new Employee();
		e1.setEmployee("nishi", "IT", 10000);
		e1.showEmployee();
		e1.grossSalary();//current obj is being identufied with repsect to the method  
	
	}

}
