import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Iterables {
	
	public static void main(String[] args) {
		
		// LAST WAY OF ITERATING OVER A COLLECTION 
				// BE ABLE TO REMOVE WHILE ITERATING OVER 
				
				List<Integer> lst = new ArrayList<>(); 
				lst.add(12) ;
				lst.add(15) ;
				lst.add(20) ;
				
				Iterator<Integer> myIterator = lst.iterator();
//				System.out.println( myIterator.next() );
//				System.out.println( myIterator.next() );
//				System.out.println( myIterator.next() );
				
				System.out.println(  myIterator.hasNext()  );
				
				while( myIterator.hasNext() ) {
					
					int target = myIterator.next() ; 
					if(target>16) {
						myIterator.remove();
					}
					
				}
				System.out.println(lst);
				
				/*
				 * Create a linkedList of String
				 * add 4 elements
				 * iterate over using iterator
				 * remove the element if it contains A and Z
				 */
				
				List<String> list = new LinkedList<>();
				
				list.add("nazim");
				list.add("zebo");
				list.add("jahongir");
				list.add("shahrizoda");
				
				System.out.println(list);
				
				Iterator<String> newIterator = list.iterator();
				
				while(newIterator.hasNext()) {
					String temp = newIterator.next();
					if(temp.contains("a") && temp.contains("z")) {
						newIterator.remove();
					}
				}
				
				System.out.println(list);
				
		
	}

}
