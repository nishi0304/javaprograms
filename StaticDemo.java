package learning.oops;
 
public class StaticDemo {
public static void main(String[] args) 
{
	System.out.println("Hospital name is "+Patient.hospitalName);//calling static variable
	System.out.println("City of hospital  is "+Patient.cityName);
	//Patient.hospitalName="max";
	//System.out.println("Hospital name is "+Patient.hospitalName);//calling static variable
     Patient p=new Patient("Scott");
     p.patientDetails();
     //System.out.println(p.hospitalName);
     Patient.showHospital();//static method is called without creating object with the class
}
}
class Patient 
{
	final static String hospitalName="KGMU";
	 static final  String cityName="Lucknow";///final is used to make the variable constant
	String name;//instance variable
	Patient (String name)
	{
		this.name=name;
	}
	void patientDetails()
	{
		System.out.println("Patient name is "+name);
		System.out.println("Patient name is "+Patient.hospitalName);
	}
	static void showHospital()
	{
		System.out.println("In method");
		System.out.println("Hospital name "+hospitalName);
		System.out.println("City is "+cityName);
	}
}
