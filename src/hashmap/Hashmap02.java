package hashmap;

import java.util.HashMap;

public class Hashmap02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 HashMap<String, Integer> ageMap = new HashMap<>();

	        // Adding data
	        ageMap.put("Alice", 25);
	        ageMap.put("Bob", 30);
	        ageMap.put("Charlie", 28);

	        // Printing HashMap
	        System.out.println("HashMap: " + ageMap);

	        // Fetching value
	        System.out.println("Bob's age: " + ageMap.get("Bob"));

	        // Checking if a key exists
	        System.out.println("Contains key 'Alice'? " + ageMap.containsKey("Alice"));

	        // Checking if a value exists
	        System.out.println("Contains value 28? " + ageMap.containsValue(28));

	        // Iterating using forEach loop
	        ageMap.forEach((key, value) -> System.out.println(key + " -> " + value));

	        // Removing an element
	        ageMap.remove("Charlie");
	        System.out.println("After removing 'Charlie': " + ageMap);
	}

}
