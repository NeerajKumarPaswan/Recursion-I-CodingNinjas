package basic_recursion;

public class DigitCount {
	
	public static int digitCount(int n) {
	
		if(n==0) {
			return 0;
		}
		
	int count=1+	digitCount(n/10);
     
        return count;
	}
	
public static void main(String[] args) {
	int count=digitCount(4537821);
	System.out.println(count);
}
}
