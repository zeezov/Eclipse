package day_02;

public class CallingExceptionExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		//try {
		callJohn();
		//} catch (InterruptedException e) {
			System.out.println("gracefully shutting down");
		//}

	}
	public static void callJohn() throws InterruptedException {
		System.out.println("starting of method callJohn() ");
		try {
			callHalil();
		} catch (InterruptedException e) {
			System.out.println("got checked exception");
		}
		System.out.println("End of callJohn() ");
		
	}

	
	public static void callHalil() throws InterruptedException {
		System.out.println("method callHalil() ");
//		try {
			throw new InterruptedException("Halil is too busy"); 
//		} catch (Exception e) {
//			System.out.println("WE GOT HALIL !!!");
//		}
		
	}

	public static void callHeydar() {
		System.out.println("method callHeydar() ");
	}

}
