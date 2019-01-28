import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPractice {
	
public static void main(String[] args) {
		
		Set<Integer> numSet = new HashSet<>(); 
		numSet.add(12) ; 
		numSet.add(20) ; 
		numSet.add(14) ; 
		numSet.add(12) ; 
		numSet.add(12) ; 
		
		System.out.println( numSet );
	
		for (Integer each : numSet) {
			System.out.println(each);
		}
		
		System.out.println();
		// TASK 1 : --> USE ITERATOR TO ITERATE OVER ABOVE SET 
		
		Iterator<Integer> iterator = numSet.iterator();
		
		//System.out.println(iterator.hasNext());
		
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}

	}

}
