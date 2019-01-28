package day_01;

public class Notes {

	/*
	 * Exceptions in Java:
	 * 
	 * Topic will be covered:
	 * 
	 * -> Understanding Exceptions: -> Error vs Exception -> Exception handling ->
	 * Exceptions hierarchy -> Checked and Unchecked Exceptions -> try, catch
	 * finally blocks
	 * 
	 * THINGS WILL FAIL ---> IT IS THE NATURE AND THINGS MAY FAIL AND IT IS THE
	 * WHOLE IDEA OF THE EXCEPTION
	 * 
	 * -> When things fail, how should we handle?
	 * 
	 * -> SOURCE OF ERRORS: Bugs - erd party library - Wrong user input - Network
	 * Issues - Hard Drive Failur
	 * 
	 * 
	 * There 2 categories of code:
	 * 
	 * 1): May Fail 2): Don't expect to fail
	 * 
	 * -> 2 categories revised: -> expected fail -> unexpected to fail
	 * 
	 * Exceptions defination: -> Non-typical, excpetional condition that signal a
	 * piece of code could not execute normally.
	 * 
	 * Exception Handling: -> Any type of aciotn to process any kind of error.
	 * 
	 * - Catch - Recover - Noitfy - Diagnose
	 * 
	 * 
	 * 1): NullPointed
	 * 
	 * 2): ArithmaticException
	 * 
	 * 3): IndexOutOfBoundException
	 * 
	 * 
	 * //1): NullPointed
	 * 
	 * String s = null;
	 * 
	 * //System.out.println(s.length()); // a paper is created, but not pointing to
	 * any address, this is the scenario happens here //-->
	 * java.lang.NullPointerException
	 * 
	 * 
	 * //2: ArithmaticException
	 * 
	 * System.out.println(" The program started "); //before it gets to the point
	 * that is throwing exception, //it works, after it is interupted, then the rest
	 * of code doesn't run
	 * 
	 * //System.out.println( 3/0 ); //--> java.lang.ArithmeticException:
	 * System.out.println(" The program ended ");
	 * 
	 * 
	 * //3): IndexOutOfBoundException:
	 * 
	 * //int [] nums = {1,2,3};
	 * 
	 * // System.out.println( nums[3] ); // -->
	 * java.lang.ArrayIndexOutOfBoundsException: 3
	 * 
	 * String str = "abc"; System.out.println(str.charAt(3));
	 * //java.lang.StringIndexOutOfBoundsException:
	 * 
	 * If things like this hapen, then you will do one of the following:
	 * 
	 * - Catch - Recover - Noitfy - Diagnose
	 * 
	 * Diagnosing Exception: --> java.lang.StringIndexOutOfBoundsException
	 * 
	 * 
	 * -> Exceptions are Ojbects like other java rules.
	 * 
	 * NullPointerException npe = new NullPointerException (); //so it is an object
	 * and you can create an object of it.
	 * 
	 * => When you run this code that you created the object of
	 * NullPointerException, an object of NullPointerException is created, then it
	 * is throwed into the program, if someone handle the program, it will be good,
	 * otherwise it will shut down your program.
	 * 
	 * -> How any exception happens behind the seen?
	 * 
	 * - Whenever an exception or error happens, compiler throw some
	 * 
	 * 
	 * -> throw keword:
	 * 
	 * NullPointerException npe = new NullPointerException ();
	 * 
	 * -> throw npe; //even you don't have any issue with the code, you use the
	 * throw keyword and throw manually some exception to the console -> An object
	 * is created behind the seen and some exception messages will be thrown.
	 * 
	 * Example:
	 * 
	 * int [] nums = {5, 20, 30, 60};
	 * 
	 * //System.out.println(nums[6]);
	 * 
	 * //there are 2 things that we can do in this point when gives us -->
	 * java.lang.ArrayIndexOutOfBoundsException
	 * 
	 * //figure 1.1: throw new ArrayIndexOutOfBoundsException(); //--> you can
	 * directly do it which is the first way of doing it
	 * 
	 * //fiqure 1.2: //ArrayIndexOutOfBoundsException aioobe = new
	 * ArrayIndexOutOfBoundsException();
	 * 
	 * //throw aioobe;
	 * 
	 * //--> It is also possible to be done like the figure 1.2
	 * 
	 * Note: You can throw any exception programatically by using of the throw
	 * keyword and you can handle it.
	 * 
	 * Can we throw any object or just can we throw anytype of object? -> in program
	 * we can only throw an exception, so after the keyword throw it should be
	 * followed by another word "exception" you just need to
	 * 
	 * There are 2 types of Exception:
	 * 
	 * 1): Compile Time Exception (Checked Exception):
	 * 
	 * 2): Run Time Exception (Unchecked):
	 * 
	 * 
	 * try { //this block just try to catch an exception and we will run up to the
	 * las line of the code
	 * 
	 * // .... } catch (Exception e) { // e --> is an object variable that
	 * everything will be stored inside the e when exception messages are thrown.
	 * //Empty It will hold everything in it. }
	 * 
	 * //FINALLY KEWORD: It is just like default part of switch statement and it
	 * will run no matter if you have exception or not
	 * 
	 * //It will run no matter if you have exception or not, it will run always,
	 * only if you use System.exit(0);
	 * 
	 * //System.exit(0); --> this just kill the block
	 * 
	 * 
	 * 
	 * Exception Hierachy:
	 * 
	 * 1) - Throwable a) Error: It something can not be recovered. Example, like
	 * server shut down and electricity goes that you can't fix it in your end.
	 * Never attemp to fix an error.
	 * 
	 * b) Exception:
	 * 
	 * -> RuntimeException: It is unchecked exception. The checked exception needs
	 * to be run before running your code, the compiller catch it The unchecked
	 * exception, you don't know until you run it.
	 * 
	 * 
	 * Object: => Throwable
	 * 
	 * 1): Error: -> ThreadDeath
	 * 
	 * -> VirtualMachineError - OutOFMemoryError
	 * 
	 * -> IOError
	 * 
	 * 2) Exception: -> RuntimeException - NullPointException - ArithmaticException
	 * 
	 * -> IOException
	 * 
	 * -> SQLExcetion
	 * 
	 * -> BrokenBarrierException
	 * 
	 * 
	 * Unchecked Exception: - We do not have to handle at the compile time -
	 * Anything that IS-A RunTimeException can be called as unchecked exception
	 * 
	 * Checked Exception: - We have to handle at the compile time or it will not
	 * compile. - Anything that IS-A Exception - But, not IS-A RuntimeException.
	 */

}
