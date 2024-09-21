package learning.oops;

public class ElectricityBill {
   String name;
   long consumerno;
    int unitconsumed;
    double totalamount;
    void setInfo(String name,long consumerno,int unitconsumed)
    {
    	this.name=name;
    	this.consumerno=consumerno;
    	this.unitconsumed=unitconsumed;
   
    }
     void calculateAmount() {
    	 if(unitconsumed<=100) 
    		 {
    		 totalamount=unitconsumed*1.20;
    		 System.out.println("Total Amount "+totalamount );
    		 
    		 } 
    	 else if(unitconsumed>100&&unitconsumed<200) {
    		 totalamount=unitconsumed*2.20;
    		 System.out.println("Total Amount "+totalamount );
    	 } 
    	 else if(unitconsumed>200&&unitconsumed<300) {
    		 totalamount=unitconsumed*3.20;
    		 System.out.println("Total Amount "+totalamount );
    	 
    		 } else {
        		 totalamount=unitconsumed*4.00;
        		 System.out.println("Total Amount "+totalamount);}
} void display() {
	System.out.println("Name is "+name);
	System.out.println("Consumer Number is "+consumerno);
	System.out.println("Unit Consumed  is "+unitconsumed);
	System.out.println("Total amount to pay "+totalamount);
                    
	
     }
public static void main(String[] args) {
	ElectricityBill obj=new ElectricityBill();
	obj.setInfo("Nishi", 23323323, 1000);
	obj.calculateAmount();
	obj.display();
}
}
