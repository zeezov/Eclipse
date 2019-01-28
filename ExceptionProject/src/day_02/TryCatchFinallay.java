package day_02;

public class TryCatchFinallay {
	
	public static void main(String[] args) {
        
		// MULTI TRY CATCH BLOCK ORDER
        /*
         * The more specific type(sub-class type) should be used first
         * in catch block and the more general type(super class type)
         * should be used after.
         *
         * If you use | to chain multiple exception in one catch block
         * THEY SHOULD NOT HAVE PARENT-CHILD RELATIONSHIP
         */
        
        try {
            Thread.sleep(1000);
            System.out.println("abc".charAt(10)); //-> strIndexOutOf
//        } catch (InterruptedException e) {
//            System.out.println(“InterruptedException”);
//        } catch (Exception e) {
//            System.out.println(“Other exception”);
        } catch(InterruptedException | StringIndexOutOfBoundsException e){
            System.out.println("I will catch 2 exceptions");
        }
        
        System.out.println("abc");
    }

	
}


