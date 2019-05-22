package OOPConcepts;

public class CallByValueandCallByRef {
	
	int p;
	int q;
	

	public static void main(String[] args) {
		
		CallByValueandCallByRef obj= new CallByValueandCallByRef() ;
				  int x=10;
				  int y=20;
				  obj.testSum(x,y);//callbyvalue and call y ref
			
				  
				  obj.p=50;
				  obj.q=40;
				     
				  obj.swap(obj);
				  System.out.println(obj.p);
				  System.out.println(obj.q);
				  
				  
	}
	  
	public int testSum(int a,int b) {
		      a=30;
	          b=40;
	          int c=a+b;
	          return c;
		
	}
	    public void swap(CallByValueandCallByRef t) {
	    	int temp;
	    	temp = t.p;
	    	t.p =t.q;
	    	t.q= temp;
	    }
}
