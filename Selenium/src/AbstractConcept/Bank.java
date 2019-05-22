package AbstractConcept;

public abstract class Bank {
	
	public abstract void loan(); //abstract method doesnt have body
	
	
	public void credit() { // non abstract method
		System.out.println("credit method");
	}
	public void debit() {
		System.out.println("debit method");
	}
	public void debit1() {
		System.out.println("debit method");
	}

}
