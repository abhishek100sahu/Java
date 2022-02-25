import java.util.Scanner;

public class Averagefunction
{
    public static void average(int a,int b, int c) {
        int average;

        average=(a+b+c)/3;
        System.out.print("Average :"+average);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking input from user
        System.out.print("Enter the Number : ");
        int a = sc.nextInt();

        System.out.print("Enter the Number : ");
        int b = sc.nextInt();

        System.out.print("Enter the Number : ");
        int c = sc.nextInt();

        average(a, b, c);
        sc.close();
    }
}
