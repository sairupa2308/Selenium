package OOPConcepts;

public class Car {
	
	//class var
     
	int model;
	int wheel;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car a = new Car();
		Car b=new Car();
		Car c=new Car();
		
	
		a.model=2015;
		a.wheel=4;
		
		b.model=2014;
		b.wheel=6;
		
		c.model=2012;
		c.wheel=8; 
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		 System.out.println(b.model);
		 System.out.println(b.wheel);
		 
		 
		 System.out.println("after shifting the references");
		 
		   a=b;
		   b=c;
		   c=a;
		   
		  a.model=10;
		  System.out.println(a.model);
		  c.model=20;
		  System.out.println(a.model);
		  System.out.println(c.model);
		  b.model=30;
		  System.out.println(b.model);
		  System.out.println(c.model);
		   
		   
	}

}
