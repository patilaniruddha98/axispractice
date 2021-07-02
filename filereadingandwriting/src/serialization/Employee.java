package serialization;

import java.io.Serializable;

public class Employee implements Serializable {

	public int id;
	public String name;
	public int age;
	public transient int ssn;
	public String address;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}
