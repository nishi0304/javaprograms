package learning.oops;

public class Bank {
	String name,type,acno;
	double balance;
	void setDetails (String name,String type,String acno,double balance)
	{
		this.name=name;
		this.type=type;;
		this.acno=acno;
		this.balance=balance;
	}
	void deposit(int amount)
	{
		double  a=amount+balance;
		System.out.println("The Amount Balance "+a);
	}
	void withdraw(int amount) 
	{
		if(amount<balance) {
			double b=balance-amount;
			System.out.println("The withdrwal amount "+b);
		} 
		else {
			System.out.println("No withdrwal possible");
		} 
	}
	void printDetails ()
	{
		System.out.println("The Name Of The Depositer "+name);
		System.out.println("The Type of the Account  "+type);
		System.out.println("The Account Number "+acno);
		System.out.println("The Balnce of the account "+balance);
		
	}
	public static void main(String[] args) {
		Bank obj=new Bank();
		obj.setDetails("Saurabh", "Current", "dn3i8", 1000);
		obj.deposit(500);
		obj.withdraw(1500);
		obj.printDetails();
		
	}

}
