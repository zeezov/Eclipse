package day_01;

public class Practice {
	
	public static void main(String[] args) {
		
		int[] nums = {1,2,3};
		
		System.out.println(nums[10]); // ArrayIndexOutOfBoundsException
		
		ArrayIndexOutOfBoundsException expt = new ArrayIndexOutOfBoundsException();
		
		// or
		
		//throw new ArrayIndexOutOfBoundsException();
		
		throw expt;
		
	}

}
