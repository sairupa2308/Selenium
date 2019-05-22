package AbstractConcept;

public class HDFCBank  extends Bank {

	
	public  void loan() {
		System.out.println("loan method");
	}
	public void credit() { // non abstract method
		System.out.println("credit method");
	}
	public void create() {
		System.out.println("create method");
	}
}
