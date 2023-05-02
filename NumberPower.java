package basic_recursion;

public class NumberPower {

	public static int powerNumber(int number,int power) {
		
		if(power==1) {
			return number;
		}
		
	int temp=	powerNumber(number, power-1);
	number=number*temp;
	return number;
	}
	
	public static void main(String[] args) {
       int product=	powerNumber(3, 6);
   System.out.println(product);
}
}
