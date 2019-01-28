package day_02;
	
	import java.util.ArrayDeque;
	import java.util.Deque;
	import java.util.LinkedList;
	import java.util.PriorityQueue;
	import java.util.Queue;

	public class Queuepractice {

		public static void main(String[] args) {
			
			Queue<Integer> que = new LinkedList<>();
			que.add(2);
			que.add(1);
			que.add(3);
			que.add(6);
			que.add(9);		
			
//			System.out.println( que );
	//
//			System.out.println( que.remove() ) ;
//			System.out.println( que.remove() ) ;
//			System.out.println( que.remove() ) ;
//			System.out.println( que.remove() ) ;
//			System.out.println( que.remove() ) ;
			
			
			Deque<Integer> dq = new ArrayDeque<>();
			dq.add(2);
			dq.add(1);
			dq.add(3);
			dq.add(6);
			dq.add(9);	
			
			System.out.println( dq );
			System.out.println(  dq.removeLast() );
			System.out.println(  dq.removeLast()  );
			System.out.println(  dq.removeLast()  );
			System.out.println(  dq.removeLast()  );
			System.out.println(  dq.removeLast()  );
			

		}

	}






