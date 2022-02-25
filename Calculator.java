import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number1 : ");
        int a = sc.nextInt();
        System.out.print("Number2 : ");
        int b = sc.nextInt();
        System.out.print("What operation do you want to perform? : ");
        char operation = sc.next().charAt(0);

        switch(operation)
        {
            case '*' :
                System.out.print("Multiplication is : " + (a*b));
                break;
            case '/' :
                {
                    if(b == 0)
                        System.out.print("invalid Number2");
                    else
                        System.out.print("Division is : " + (a/b));
                break;
                }
            case '+' :
                System.out.print("Addition is : " + (a+b));
                break;
            case '-' :
                System.out.print("Substraction is : " + (a-b));
                break;
            case '%' :
                System.out.print("Remainder is : " + (a%b));
                break;

            default :
                System.out.print("Something is wrong.");
        }
        sc.close();
    }
}