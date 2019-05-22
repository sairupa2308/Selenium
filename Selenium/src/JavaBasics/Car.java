 package JavaBasics;

public class Car {
           
	int bottle;
	int cap;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Car a = new Car();
		Car b = new Car();
		
		a.bottle = 2016;
		a.cap = 20;
		
		b.bottle = 84798;
		b.cap = 8434;
		 System.out.println(a.bottle);
		 System.out.println(b.cap);
		 
		 
		 System.out.println("after changing the references");
		 
		 a=b;
		 b=a;
		 
		 
		 a.bottle = 10;
		 System.out.println(a.bottle);
		 
		 b.cap = 20;
		 System.out.println(b.cap);
		
	}

}
