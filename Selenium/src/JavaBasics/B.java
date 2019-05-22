package JavaBasics;

public class B extends A{
	
	public B() {
		super();// to call parent class constructor
		System.out.println("child class method");
	}
	public B(int i) {
		super(i);
		//System.out.println("child class method");
	}
	public B(int i, int j) {
		super(i,j);
		
	}


    public static void main(String args[]) {
    	B obj = new B(); 
    	B obj1 = new B(10); 
    	B obj2 = new B(10,20); 
    	
    
    }
}
