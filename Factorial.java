import java.util.Scanner;

public class Factorial
{
    public static int factorial(int a) {

    	int fact=1;
        for (int i=a; i>=1; i--) {
            fact *=i;
        }
        return (fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int n = sc.nextInt();

        if(n<0) {
        	System.out.println("Invalid Number");
        	sc.close();
        	return;
        }
        else{
        	int fact = factorial(n);

        	System.out.print("Factrial of "+n);
        	System.out.print(" is "+fact);
        	sc.close();
        }
    }
}
