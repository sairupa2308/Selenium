package OOPConcepts;

public class LocalvsGlobalVariable {

	static int n=100; // from static  call to static method and variables 
	public static void test() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		System.out.println(n);
		test();

		

	}

}
