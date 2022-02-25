import java.util.Scanner;

public class Primefunction
{
    public static void primeornot(int a) {
        boolean flag = false;
        for (int i = 2; i <= a / 2; ++i) {
      // condition for non prime number
            if (a % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(a + " is a prime number.");
        else
            System.out.println(a + " is not a prime number.");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking input from user
        System.out.print("Enter the Number : ");
        int a = sc.nextInt();

        primeornot(a);
        sc.close();
    }
}
