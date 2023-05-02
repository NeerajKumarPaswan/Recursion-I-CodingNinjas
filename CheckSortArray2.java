package basic_recursion;

public class CheckSortArray2 {
	public static boolean isArraySorted(int[] a,int si) {
		// TODO Auto-generated method stub
		if(si==a.length-1) {
			return true;
		}
		
		if(a[si]>a[si+1]) {
			return false;
		}
		return isArraySorted(a,si+1);
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		
		 boolean res=isArraySorted(a,0);
		 System.out.println(res);
	}
}
