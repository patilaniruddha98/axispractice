package comparable;

import java.util.TreeSet;

public class CustomerComparable implements Comparable<CustomerComparable> {
	private int id;
	private String name;
	private int salary;
	
	
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", salary=" + salary
				+ "]";
	}




	public CustomerComparable(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int compareTo(CustomerComparable c) {
		 if(this.salary > c.salary) {
			return 1;
			
		}else if(this.salary == c.salary) {
			return 0;
			
		}
		else 
			return -1;
		}
		
	


	public static void main(String[] args) {
		TreeSet<CustomerComparable> customer = new TreeSet<CustomerComparable>();
		CustomerComparable customer1 =  new CustomerComparable(1, "Aniruddha", 6000);
		CustomerComparable customer2 =  new CustomerComparable(2, "Chitrak", 4000);
		CustomerComparable customer3=  new CustomerComparable(3, "Yash", 8000);
		
		
		customer.add(customer1);
		customer.add(customer2);
		customer.add(customer3);
		
		System.out.println(customer);
	}

}
