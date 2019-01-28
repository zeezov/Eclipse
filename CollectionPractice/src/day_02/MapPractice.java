package day_02;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
	
public static void main(String[] args) {
		
		// Type<typeOfItem> ----- 
		
		// Type<KeyType, ValueType> ---- 
		
		// i want to store country and gold medal count as per item
		
		
		Map<String, Integer> ctMedalMap = new HashMap<>() ;
		ctMedalMap.put("USA", 28) ; 
		ctMedalMap.put("UK", 20) ; 
		ctMedalMap.put("France", 17) ; 
		ctMedalMap.put("Italy", 25) ;
		ctMedalMap.put("Italy", 100) ;

		System.out.println(ctMedalMap);
		
		System.out.println();
		
//		// CRUD Operation ---> Create , Read/Retrieve, Update, Delete
//		System.out.println(  ctMedalMap.get("USA")  );
//		
//		Integer cntOfItaly = ctMedalMap.get("Italy")  ; 
//		System.out.println(cntOfItaly);
//		
//		ctMedalMap.replace("Italy", 50) ; 
//		System.out.println( "New Italy Count: " + ctMedalMap.get("Italy")   );
//		
//		ctMedalMap.remove("Italy") ; 
//		System.out.println(ctMedalMap);
//		
		/*
		 * Create a map of Long , String to represent
		 * product ID and product name 
		 * add 5 items , try to add duplicate and see what happen 
		 * read first 3 values 
		 * update second product name
		 * remove last product
		 * 
		 * print out each time you do a change 
		 * 
		 * */
		
		Map <Long, String> productID = new HashMap<>();
		
		productID.put(44L, "Beef");
		productID.put(32L, "Milk");
		productID.put(44L, "Beef");
		productID.put(14L, "Tomatoes");
		productID.put(33L, "Onions");
		
		System.out.println(productID);
		
		System.out.println(productID.get(44L));
		System.out.println(productID.get(32L));
		System.out.println(productID.get(44L));
		
		productID.replace(32L, "Orange");
		System.out.println(productID.get(32L));
		
		productID.remove(33L);
		System.out.println(productID.get(14L));
		
		
		
		
		
		
		
	}
	
	

}
