package day_02;

public class ThrowException {
	
	public static void main(String[] args) throws Exception {

		System.out.println("program started");
		
		// instead of using method exception we used try catch block here
		try {
			playWithWater() ;
		} catch (RuntimeException e) {
			System.out.println("got ya");
		}
		
		// to run this method we used throws exceptio on method
		playWithFire() ; 
		System.out.println("program ended");
		
	}
	
	public static void playWithFire() throws Exception {
		
		try {
			throw new Exception("playing with hot FIRE");
		} catch (Exception e) {
			System.out.println("GOT YA IN THE METHOD");
		}
	}

	public static void playWithWater() throws RuntimeException {
		
		System.out.println(  " playWithWater message " );
		try {
			throw new RuntimeException("playing with hot water");
		} catch (Exception e) {
			System.out.println("GOT YA IN THE METHOD");
		}
		
		
	}


}
