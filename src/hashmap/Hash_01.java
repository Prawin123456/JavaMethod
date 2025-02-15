package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Hash_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(101, "sita");
		map.put(102, "son");
		map.put(103, "cab");
		map.put(104, "mom");
		

		System.out.println("value for key 2 :" + map.get(102));
		System.out.println("value for key 4 :" + map.get(104));
		System.out.println("********************************");
		System.out.println("value for key 2 :" + map.containsKey(102));
		
		System.out.println("*********************************");
		
		

		//To print all key value pairs
		
		for(Integer key:map.keySet()) {
			System.out.println(key + " " +map.get(key));
		}
		
		System.out.println("*********************************");
		
		
		System.out.println("contains value son :" +map.containsValue("son"));
		
		 System.out.println("Size of HashMap: " + map.size());
		 
		 map.remove(4);
	     System.out.println("After removing key 4: " + map);
		
		
		
		}
	
	
}
	
	
	


