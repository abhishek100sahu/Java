import java.util.Scanner;

public class PrintMyName {

	public static void printMyName(String name) {

		System.out.println("Your name is "+name);
		return;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		printMyName(name);
		sc.close();
	}

}
