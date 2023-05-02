package basic_recursion;

public class FirstIndex2 {
	public static int firstIndexBetter(int a[], int x, int si) {
		if (si == a.length) {
			return -1;
		}
		if (a[si] == x) {
			return si;
		}

		int k = firstIndexBetter(a, x, si + 1);
		return k;
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int index = firstIndexBetter(a, 5, 0);
		System.out.println(index);
	}
}
