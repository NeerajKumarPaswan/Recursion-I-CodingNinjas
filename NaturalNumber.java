package basic_recursion;

public class NaturalNumber {

	public static void naturalNumbers(int n) {
		if (n == 1) {

			System.out.println("1");
			return;
		}

		naturalNumbers(n - 1);
		System.out.println(n);

	}

	public static void main(String[] args) {
		naturalNumbers(10);

	}
}
