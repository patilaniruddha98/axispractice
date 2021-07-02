package assignment1;

import java.io.Serializable;

public class Customer implements Serializable {
	
	public String customerName;
	public String address;
	public String phone;
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", address=" + address + ", phone=" + phone + "]";
	}
	
	
	
	
	
	

}
