package OOPConcepts;

public class LocalvsGlobalVariables2 {
	 String name="tom";//global variables
	 int age=25;
	


	public static void main(String[] args) {
		  
		int i=10;//local variables
		System.out.println(i);
		
		LocalvsGlobalVariables2 obj = new  LocalvsGlobalVariables2();
		System.out.println(obj.name );
	 
	}
	public void sum() {
		int i=15;
		int j=20;
		
	}

}
