package JavaBasics;

public class GlobalvsLocal {
	
	String name = "rupa";//global variable -- inside class methods
	int age = 25;
	

	public static void main(String[] args) {
		
		int i =10;
		System.out.println(i);

		GlobalvsLocal obj = new GlobalvsLocal();
		obj.sum();
		System.out.println(obj.age);
		
		//String s = obj.name();
		System.out.println(obj.name);
		
		 
	}
      public void sum() {
    	  int i = 10;
    	  System.out.println(i);
      }
	
	
}
