package basic_recursion;

public class NumberSearch {

	
	
	public static boolean checkNumber(int input[], int x) {
		
		if(input.length<=0) {
			return false;
		}
		if(input[0]==x) {
			return true;
		}
		int small_array[]=new int[input.length-1];
		for(int i=1;i<input.length;i++) {
			small_array[i-1]=input[i];
		}
		
	return	checkNumber(small_array, x);
	      	
	}
	public static void main(String[] args) {
		int input[]= {1,2,3,4,5};
		System.out.println(checkNumber(input, 6));
		
	}
	
}
