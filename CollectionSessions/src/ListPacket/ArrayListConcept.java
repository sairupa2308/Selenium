package ListPacket;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]=new int[4];//static array ---fixed size

     
     

         ArrayList ar= new ArrayList();
         
            ar.add(10);
            ar.add(20);
            ar.add(30);
            System.out.println(ar.size());
            
            ar.add(40);
            ar.add(60);
            ar.add(60);
            System.out.println(ar.size());
            
            System.out.println(ar.get(4));
        //for loop
            
            for(int i=0;i<ar.size();i++){
            	System.out.println(ar.get(i));
            }
             
           //generic vs non generic
             
            ArrayList<Integer> ar1 = new ArrayList<Integer>();
            ar1.add(100);
            
            ArrayList<String> ar2 = new ArrayList<String> ();
            ar2.add("selenium");
                 
            ArrayList<E> ar3 = new ArrayList<E>();
            
            
            Employee e1 = new Employee("naveen" , 24 , "Qa");
            Employee e2 = new Employee("Tom" , 24 , "Qb");
            Employee e3 = new Employee("Rupa" , 22 , "Rc"); 
            
            ArrayList<Employee> ar4 = new ArrayList<Employee>();
            ar4.add(e1);
            ar4.add(e2);
            ar4.add(e3);
            
            //iterator 
            Iterator <Employee> it = ar4.iterator();
            while(it.hasNext()) {
            	Employee emp = it.next();
            	System.out.println(emp.name);
            	System.out.println(emp.age);
            	System.out.println(emp.dept);
            }
            

            
            
            








	}

}
