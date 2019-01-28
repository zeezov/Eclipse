package day_03;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPractice {
	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("1", "A");
		map.put("2", "B");
		map.put("3", "C");
		map.put("4", "D");
		map.put("5", "E");
		map.put("6", null);
		
		
		System.out.println(map.get("1"));
		System.out.println(map.get("5"));
		
		//map.put("5", "Z");
		map.putIfAbsent("5", "Z");
		System.out.println(map);
		
		map.replace("4", "K");
		System.out.println(map);
		// if value at key 3 is equal to C - replace it with CCC
		map.replace("3", "C", "CCC");
		System.out.println(map);
		
		System.out.println(map.get("abc"));
		
		String abcVal = map.getOrDefault("abc", "defalt value");
		System.out.println(abcVal);

		//map.remove("6");
		System.out.println(map);

		/// view !!!
		/*
		 * keySet() values() , entrySet()
		 * 
		 */
		
		// to get the keys
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		// to get the values
		Collection<String> values = map.values();
		System.out.println(values);
		
		Set<Entry<String, String>> entrySetView = map.entrySet();

		for (Entry<String, String> entry : entrySetView) {
			
			System.out.println(  entry.getKey() + " -- >" + entry.getValue()   );
			
			if (entry.getValue() == null) {
				entry.setValue("Something else");
			}

		}
		
		System.out.println(map);


	}
		

}
