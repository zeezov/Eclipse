import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class day_01 {
	
	public static void main(String[] args) {
		
		
		/*
		 * Task 1.
		 * 
		 * Create an ArrayList of String
		 * add 5 items, iterate over it.
		 * 
		 * Use Collection interface as referece type
		 */
		
		//Collection<String> items = new ArrayList<>();
		
		List<String> items = new ArrayList<>();
		
		items.add("Tashkent");
		items.add("Buhoro");
		items.add("Samarkand");
		items.add("Hiva");
		items.add("Horazm");
		
		//Collections.frequency(items, "Tashkent");
		
		for (String str : items) {
			System.out.println(str);
		}
		
		// internalli LinkedList work differently. They are all linked to each other
		// It is faster when adding or removeing to it
		// it is slower when you want to remove item by index number, it has to go thorugh each
		// items because they are linked to each other. 
		items = new LinkedList<>();
		
		items.add("apple");
		items.add("orange");
		items.add("kiwi");
		
		/*
		 * 
		 */
		
		
		
//		for (int i = 0; i < items.size(); i++) {
//			System.out.println(items);
//		}
//		
//		System.out.println(items);
		
		
		
		
	}

}
