package recursion;

public class nNaturalNUmbers {
	public static void printNumbers(int i, int n, int sum) {
		if (i == n) {
			sum += i;
			System.out.println(sum);
			return;
		}
		sum += i;
		printNumbers(i+1, n, sum);
		System.out.println(i);
	}
	public static void main(String args[]) {
		printNumbers(1, 5, 0);
	}
}
