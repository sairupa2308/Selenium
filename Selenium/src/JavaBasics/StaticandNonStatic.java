package JavaBasics;

public class StaticandNonStatic {
          String name = "tom"; // non static global variables
           static int age = 25; // static global variables
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticandNonStatic.sum();
		sum();
		
		StaticandNonStatic  obj = new StaticandNonStatic();
		obj.sendmail();
		//System.out.println(StaticandNonStatic.age);
		System.out.println(obj.name);
		System.out.println(obj.age);
	}

	public static void sum() {
		System.out.println("sum method");
	}
	
	public void sendmail() {
		System.out.println("sendmail method");
	}
}
	/* String x = "30";
System.out.println(x+20);

          int i = Integer.parseInt(x);
          System.out.println(i+20);
          
          String y = "12.33";
          double d = Double.parseDouble(y);
          System.out.println(d+50);
     
         //  String k = "hddh";
          




	}*/

