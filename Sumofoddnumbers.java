import java.util.Scanner;

public class Sumofoddnumbers
{
    public static void sumofoddnumbers(int a) {
        int sum=0;

        for (int i=a; i>=1; i--) {
            if (i%2!=0) {
                sum+=i;
            }

        }
        System.out.print("Sum of odd numbers of "+a);
        System.out.print(" is "+sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking input from user
        System.out.print("Enter the Number : ");
        int a = sc.nextInt();

        sumofoddnumbers(a);
        sc.close();
    }
}
