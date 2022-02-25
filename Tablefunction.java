import java.util.Scanner;

public class Tablefunction
{
    public static void table(int a) {
        int b=1;
        for (int i=1; i<=10; i++) {
            b=a*i;
            System.out.print(a+" * ");
            System.out.print(i+" = ");
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking input from user
        System.out.print("Enter the Number : ");
        int a = sc.nextInt();

        table(a);
        sc.close();
    }
}
