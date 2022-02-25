package recursion;

public class RecursionFactorial {
	public static void fact(int i, int n, int fact) {
		if (i == n) {
			fact *= i;
			System.out.println(fact);
			System.out.println(i);
			return;
		}
		fact *= i;
		fact(i+1, n, fact);
		System.out.println(i);
	}

	public static void main(String args[]) {
		fact(1, 6, 1);
	}
}
