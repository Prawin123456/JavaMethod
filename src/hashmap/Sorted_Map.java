package hashmap;

import java.util.HashMap;
import java.util.TreeMap;

public class Sorted_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(4, "Cherry");
        map.put(2, "Date");

        System.out.println("Unsorted HashMap: " + map);

        // Sorting by keys using TreeMap
        TreeMap<Integer, String> sortedMap = new TreeMap<>(map);
        System.out.println("Sorted by Key: " + sortedMap);
    }
	}


