package mappingExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1= new Employee(1,"aniruddha");
		Employee e2= new Employee(2,"Harshwardhan");
		
		HashMap<Integer, Employee> map= new HashMap<Integer,Employee>();
		
		map.put(1, e1);
		map.put(2, e2);
		
		//System.out.println(map);
		
		
		Set<Entry<Integer,Employee>> set= map.entrySet();
		Iterator<Entry<Integer, Employee>> it = set.iterator();
		
		while(it.hasNext()){
			Map.Entry element = (Map.Entry)it.next();
			
			System.out.println(element.getKey()+"  "+element.getValue());
		}
		
		

	}

}
