package day_02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetPractice {
	
	public static void main(String[] args) {
		
	
	
	// Create a List of String with ArrayList implimentation
	// add 5 items with duplicates
	// and try to get the size of uniqu items
	
	List<String> list = new ArrayList<>();
	
	list.add("A");
	list.add("B");
	list.add("A");
	list.add("B");
	list.add("C");
	
	System.out.println(list);
	
	Set<String> unique = new HashSet<>();
	
	unique.addAll(list);
	
	System.out.println(unique);
	
	/*
	 * public static void main(String[] args) {
		
		List<String> lst = new ArrayList<>();
		lst.add("A");
		lst.add("A");
		lst.add("z");
		lst.add("b");
		lst.add("B");
		lst.add(" ");
		lst.add("9");

		//System.out.println(  lst.subList(2, 5) );
		
		//System.out.println( lst );
		
//		Set<String> set = new HashSet<>( lst  );
//		System.out.println( set );

		//Set<String> sSet = new TreeSet<>( lst ) ;
		SortedSet<String> sSet = new TreeSet<>( lst ) ;
		System.out.println( sSet);
		
		System.out.println( sSet.subSet("9","z") );
		
		
		
		
		//System.out.println(sSet);
		
		
		
		
		
		//System.out.println( set.size() );
		
//		for (int i = 0; i < lst.size(); i++) {
//			set.add(  lst.get(i)   ) ; 
//		}
//		
//		System.out.println(  set.size()  );
		
//		set.addAll(lst);
		//System.out.println(  set.size()  );
		
		//List<String> lst2 = new ArrayList<>(  lst );
		//System.out.println( lst2);
	 */
	
	
	
	/*
	 * List<String> ls = new ArrayList<>();
        
        ls.add(“aa”);
        ls.add(“bb”);
        ls.add(“cc”);
        ls.add(“aa”);
        ls.add(“dd”);
        
        int count = 0;
        
        for (int i = 0; i < ls.size(); i++) {
            String hold = ls.get(i);
            for (int j = 0; j < ls.size(); j++) {
                if(hold.equals(ls.get(j)) && i != j) {
                    count++;
                }
            }
        }
        System.out.println(count);
	 */
	
 }	

}
