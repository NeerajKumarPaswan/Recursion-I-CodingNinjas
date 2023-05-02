package basic_recursion;

public class FibonacciNumber {

	
	public static int fibonacci(int n) {
//		if(n<2) {
//			return n;
//		}
//		
//		return fibonacci(n-1)+fibonacci(n-2);
		
		if(n==1||n==2) {
			return 1;
		}
		
		int fib_n_1=fibonacci(n-1);
		int fib_n_2=fibonacci(n-2);
		int result=fib_n_1+fib_n_2;
		return result;
	}
	public static void main(String[] args) {
		int res=fibonacci(4);
		System.out.println(res);
	}
}
