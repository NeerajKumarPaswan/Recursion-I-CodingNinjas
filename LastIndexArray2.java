package basic_recursion;

public class LastIndexArray2 {
	public static int lastIndexBetter(int a[],int x,int si) {
		if(si==a.length) {
			return -1;
		}
		
		
		int k= lastIndexBetter(a, x, si+1);
		if(k!=-1) {
			return k;
		}else
			if(a[si]==x) {
				return si;
			}else {
				return -1;
			}
		
	}
	
	public static void main(String[] args) {
		int a[] = { 1, 2,8, 4, 3, 5, 6, 8 };
		System.out.println( lastIndexBetter(a, 8, 0));
             
	}

}
