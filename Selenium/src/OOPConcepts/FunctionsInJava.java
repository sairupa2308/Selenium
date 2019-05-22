package OOPConcepts;

public class FunctionsInJava {

	public static void main(String[] args) {
    
		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		
	int l = obj.pqr();
	System.out.println(l);

	String s1=obj.qa();
	System.out.println(s1);
	
	int d1= obj.division(20, 20);
	System.out.println(d1);
	
	}
	//non static methods
	//void : there is no return type value
	public void test() {
		System.out.println("test method");
	}
	
	public int pqr() {
		System.out.println("pqr method");
		 int a=10;
		 int b=20;
		 int c=a+b;
		 return c;
		
		 
		 
	}
	public String qa() {
		System.out.println("qa method");
		String s = "selenium";
		 return s;
		 
	}
	
	public int division(int x,int y) {
		System.out.println("division method");
		 int d=x/y;
		 return d;
		
		
	}
	

}
