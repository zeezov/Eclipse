package day_03;

import java.util.*;

public class MapSortedOrder {
	
	public static void main(String[] args) {
		
		SortedMap<String, Integer> products = new TreeMap<>();
		products.put("Adapter", 53);  //put method for putting new key&value
		products.put("Keyboard", 26);
		products.put("Mouse", 13);
		products.put("Router", 99);
		products.put("TV", 12526);
		products.put("Radio", 1328);
		products.put("Phone", 26549);
		/// MORE SPECIALIZED VIEW WHEN IT COMES TO SORTED MAP 
		// supMap , headMap , tailMap 
		System.out.println(products);
		
		SortedMap<String, Integer> KPproducts = products.subMap("K", "Rz") ;
		SortedMap<String, Integer> headProducts = products.headMap("P") ; 
		SortedMap<String, Integer> tailProducts = products.tailMap("P") ; 
		
		String firstKey = products.firstKey();
		String lastKey = products.lastKey();
		
		
		System.out.println(KPproducts );
		System.out.println(headProducts );
		System.out.println(tailProducts );
		System.out.println(" products.firstKey() --> " + firstKey );
		System.out.println(" products.lastKey() --> " + lastKey );
		
		System.out.println(" products first value --> " + products.get(firstKey) );
		System.out.println(" products last value --> " + products.get(lastKey) );
		
//		SortedSet<String> kSet =  (SortedSet<String>) products.keySet() ; 
//		System.out.println(kSet);
		
		
		

		
		
	}

}
