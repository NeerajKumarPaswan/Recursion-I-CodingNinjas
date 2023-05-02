package basic_recursion;

public class ArraySum {
	
//	public static int arraySum(int arr[],int n) {
//		
//		if(n<=0) {
//			return 0;
//		}
//		return arraySum(arr, n-1)+arr[n-1];
//		
//	}
   static	int sum=0;
	public static int sum(int input[]) {
		if(input.length<=0) {
			return 0;
		}
		sum=sum+input[0];
		int small_array[]=new int[input.length-1];
		for(int i=1;i<input.length;i++) {
			small_array[i-1]=input[i];
		}
		sum(small_array);
		return sum;
	}
		
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
   int sum=	sum(a);
   System.out.println(sum);
}
}
