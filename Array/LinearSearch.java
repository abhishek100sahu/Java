package Array;
import java.util.Scanner;

public class LinearSearch
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // input
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }
        // search
        System.out.print("Search : ");
        int x = sc.nextInt();

        // output
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == x) {
                System.out.println("x found at index : "+i);
            }
            else
            {
            	System.out.println("x not found");
            	break;
            }
        sc.close();
        }
    }
}
