package basic_recursion;

public class CheckSortArray1 {
//ascending order
	public static boolean isArraySorted(int a[]) {
		if(a.length==1) {
			return true;
		}
		
		if(a[0]>a[1]) {
			return false;
		}
		int smallArray[]=new int[a.length-1];
		for(int i=1;i<a.length;i++) {
			smallArray[i-1]=a[i];
		}
		
		boolean isSorted=isArraySorted(smallArray);
		return isSorted;
	}
	
	public static void main(String[] args) {
		int a[]= {1,2,4,3,4,5};
		
		 boolean res=isArraySorted(a);
		 System.out.println(res);
	}
}
