package object_array_list;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1= new Employee(1,"aniruddha","mumbai");
		Employee e2= new Employee(1,"Yash","hyd");
		Employee e3= new Employee(1,"parvesh","mumbai");
		Employee e4= new Employee(1,"chitrak","col");
		Employee e5= new Employee(1,"satya","somewhere on earth");
		
		ArrayList<Employee> list= new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		System.out.println(list);
		

	}

}
