package JavaBasics;

public class ConstructorConcept { // the moment you create the object of this particular class
	
	public ConstructorConcept() {
		System.out.println("constructor is default method");
	}
	 public ConstructorConcept(int i) {
		 System.out.println("one parameter");
		 System.out.println("the value of i " + i);
	 }
	public ConstructorConcept(int i , int j) {
		System.out.println("two parameter");
		System.out.println("the value of i " + i);
		System.out.println("the value of j " + j);
	}
	
	

	public static void main(String[] args) {
		
		ConstructorConcept obj = new ConstructorConcept ();
		ConstructorConcept  obj1 = new ConstructorConcept (10);
		ConstructorConcept  obj2 = new ConstructorConcept (20,30);
 
	}

}// one hidden constructor is there always
// there is no return type
//it must must be same as class name
//its just  look like a function but not a function
// it is default constructor
// it can be overload

